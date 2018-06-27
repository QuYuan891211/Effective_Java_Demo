package Tip1_StaticFactoryMethod;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
//业务逻辑：提供者必须先注册，其它访客才能拿到提供者提供的服务，否则失败
public class Services {
    private Services(){};
    private static Map<String,Provider> providerMap = new ConcurrentHashMap<String, Provider>();

    //1.服务的注册API
    public static void registerDefaultProvider(Provider provider, String providerName){
        registerProvider(providerName,provider);
    }
    private static void registerProvider(String name, Provider provider){
        providerMap.put(name,provider);
    }
    //2.服务的访问API
    public static Service newInstance(String providerName){
        return getService(providerName);
    }
    private static Service getService(String name){
        Provider provider = providerMap.get(name);
        if(provider==null){
            throw new IllegalArgumentException();
        }
        return provider.newService();
    }
}
