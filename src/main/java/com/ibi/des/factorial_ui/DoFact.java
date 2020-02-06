package com.ibi.des.factorial_ui;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.HttpRequestHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

@Controller
public class DoFact {

    @RequestMapping("/dofact")
    @ResponseBody
    public String doFact(@RequestParam String fvalue)
    {
        // sample
        // curl -X GET "http://localhost:9090/calc?value=10" -H "accept: */*"
        // ifactorial is the name setup up in the kubernetes services. 
        // this should be externalized. 
        // Any takers?
        String url = "http://ifactorial:9090/calc";

        UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(url)
                .queryParam("value", fvalue);

        Map<String, String> params = new HashMap<>();
        params.put("value", fvalue);
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(builder.toUriString(), String.class, params);
    }
}
