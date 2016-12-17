package com.zwstech.controller;

import com.zwstech.domain.DataWrapper;
import com.zwstech.domain.Version;
import com.zwstech.mapper.VersionMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wutairui on 2016/12/14.
 */

@RestController
@RequestMapping(value = "/versions")
public class VersionController {

        @Autowired
        private VersionMapper versionMapper;

        @RequestMapping(value = "/all/{appid}", method = RequestMethod.GET)
        public DataWrapper<List<Version>> getVersionByAppNum(@PathVariable int appid){
            return new DataWrapper<>(versionMapper.findByAppNum(appid));
        }

        @RequestMapping(value = "/{id}", method =  RequestMethod.GET)
        public DataWrapper<Version> getVErsionById(@PathVariable int id){
                return new DataWrapper<>(versionMapper.getVersionById(id));
        }



        @RequestMapping("/json")
        public String json() throws Exception{
                ArrayList<String> test = new ArrayList<>();
                return test.get(3);
        }
}
