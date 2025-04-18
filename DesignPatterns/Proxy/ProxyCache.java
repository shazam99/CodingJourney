package DesignPatterns.Proxy;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class ProxyCache implements PaymentService {
        private final RealPaymentService realPaymentService= new  RealPaymentService();
        private Map<String, CacheRequest> cache = new HashMap<>();


    @Override
    public String getTransactionStatus(String txnId) {
        CacheRequest cachedRequest = cache.get(txnId);
        if(cachedRequest != null && !isExpired(cachedRequest)){
            return cachedRequest.getStatus();
        }

        String status = realPaymentService.getTransactionStatus(txnId);
        cache.put(txnId, new CacheRequest(status, System.currentTimeMillis()));
        return status;
    }

    private boolean isExpired(CacheRequest cachedRequest) {
        long expiry = 5*60*1000;
        return System.currentTimeMillis()-cachedRequest.getTimeStamp() > expiry;
    }

}

interface PaymentService{
    String getTransactionStatus(String txnId);
}
class RealPaymentService implements PaymentService{

    @Override
    public String getTransactionStatus(String txnId) {
        return "success";
    }
}



class CacheRequest implements Serializable {
    String status;
    long timeStamp;

    public CacheRequest(String status, long timeStamp) {
        this.status = status;
        this.timeStamp = timeStamp;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public long getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(long timeStamp) {
        this.timeStamp = timeStamp;
    }
}
