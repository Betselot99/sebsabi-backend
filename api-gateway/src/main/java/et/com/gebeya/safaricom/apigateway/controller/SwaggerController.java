//package et.com.gebeya.safaricom.apigateway.controller;
//
//import org.springdoc.core.AbstractSwaggerUiConfigProperties;
//import org.springframework.cloud.client.discovery.DiscoveryClient;
//import org.springframework.http.server.reactive.ServerHttpRequest;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import java.net.URI;
//import java.net.URISyntaxException;
//import java.util.LinkedHashMap;
//import java.util.LinkedList;
//import java.util.List;
//import java.util.Map;
//
//@RestController
//public class SwaggerController {
//
//    private final DiscoveryClient discoveryClient;
//
//    public SwaggerController(DiscoveryClient discoveryClient) {
//        this.discoveryClient = discoveryClient;
//    }
//
//    @GetMapping("/v3/api-docs/swagger-config")
//    public Map<String,Object> swaggerConfig(ServerHttpRequest serverHttpRequest) throws URISyntaxException{
//        URI uri=serverHttpRequest.getURI();
//        String url=new URI(uri.getScheme(),uri.getAuthority(),null,null,null).toString();
//        Map<String,Object> swaggerConfig=new LinkedHashMap<>();
//        List<AbstractSwaggerUiConfigProperties.SwaggerUrl> swaggerUrlList=new LinkedList<>();
//        System.out.println("Services = "+discoveryClient.getServices());
//        discoveryClient.getServices().forEach(serviceName ->swaggerUrlList.add(new AbstractSwaggerUiConfigProperties.SwaggerUrl(serviceName,url +"/" + serviceName + "/v3/api/-docs")));
//        swaggerConfig.put("urls",swaggerUrlList);
//        return swaggerConfig;
//    }
//}
