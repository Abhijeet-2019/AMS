package com.ams.app.utils;

public class AmsResponseObj {
        public  static final String SUCCESS = "SUCCESS";
        public  static final String ERROR = "ERROR";
        private String responseStatus;
        private Object responseData;
        
        
        public String getResponseStatus() {
                return responseStatus;
        }
        
        public void setResponseStatus(String responseStatus) {
                this.responseStatus = responseStatus;
        }
        
        public Object getResponseData() {
                return responseData;
        }
        
        public void setResponseData(Object responseData) {
                this.responseData = responseData;
        }
}

