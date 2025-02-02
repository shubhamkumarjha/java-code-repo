import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpHeaders;
import java.net.http.HttpRequest;
import java.time.Duration;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class Demo4 {

}






/*
@RestController("/product/1.0.0/")
class ProductController{

    @Autowired
    ProductService productService;

    @PostMapping("/userproduct")
    Respone<UserProductResponse> getProductByUser(@RequestBody UserProductRequest userProductRequest){
        log.info("getProductByUser UserProductRequest :: "+userProductRequest);
        return productService.getProductByUser(userProductRequest);
    }

}

class ProductService(){

    @Autowired
    RestTemplate restTemplate;

    @Autowired
    KafkaTemplate kafkaTemplate;

    @Autowired
    UserProductRepository userProductRepository;

    @Value("{wells.get.product.url}")
    String url;

    @Value("{wells.get.product.token}")
    String accessToken;

    @Transactional
    Respone<UserProductResponse> getProductByUser(UserProductRequest userProductRequest) throws Exception{
        log.info("getProductByUser UserProductRequest :: "+userProductRequest);
        if(ObjectUtils.isEmpty(userProductRequest) || StringUtils.isEmpty(userProductRequest.getUserId())
                || StringUtils.isEmpty(userProductRequest.getProductId())){
            throw ValidationException("UserId or ProductId cannot be empty");
        }

        if(UserService.isUserExist(userProductRequest.getUserId())){
            throw ValidationException("Invalid UserId or user doesn't exist");
        }

        if(UserService.isUserAdmin(userProductRequest.getUserId())){
            throw ValidationException("User is not authorized");
        }

        if(UserService.isUserExist(userProductRequest.getUserId())){
            throw ValidationException("Invalid UserId or user doesn't exist");
        }

        Map<String, Object> httpHeaders = new HashMap<>();
        httpHeaders.put("Authorization", accessToken);
        httpHeaders.put("Accept", "application/json");
        httpHeaders.put("Content-type", "application/json");

        GetProductRequest getProductRequest = new GetProductRequest(userProductRequest.getProductId());
        HttpRequest request = new HttpRequest(httpHeaders,getProductRequest);

        kafkaTemplate.send(getProductRequest);

        */
/*ResponseEnity productResponseEntity = restTemplate.exchange(url, HttpMethod.POST, request);
        boolean productExist = false;
        if(productResponseEntity.isSuccessfull
                && (!ObjectUtils.isEmpty(productResponseEntity.getBody()))
                && (!ObjectUtils.isEmpty (productResponseEntity.getBody().getProduct()))){
            productExist = true;
        }*//*

        UserProduct userProduct = new UserProduct(userProductRequest.getUserId(), userProductRequest.getProductId(), productExist );
        userProductRepository.save(userProduct);
        return userProduct;
    }


}

@KafkaListner(productTopic)
consumeProductRequest(ProductRequest productRequest){

    //validate and return request

}*/
