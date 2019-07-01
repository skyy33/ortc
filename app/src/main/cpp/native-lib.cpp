#include <jni.h>
#include <string>
#include <regex>
#include "ortc.hpp"

extern "C" {
JNIEXPORT jstring JNICALL Java_com_vrv_ortc_ORTC_getExtendedRtpCapabilities(
        JNIEnv *env,
        jclass cls, jstring j_str, jstring j_str1) {


    const char *c_str = NULL;
    c_str = env->GetStringUTFChars(j_str, NULL);


    const char *c_str1 =NULL;
    c_str1 =env->GetStringUTFChars(j_str1, NULL);


    nlohmann::json  local=  nlohmann::json::parse(c_str);
    nlohmann::json  remote=  nlohmann::json::parse(c_str1);

    nlohmann::json response = mediasoupclient::ortc::getExtendedRtpCapabilities(local, remote);


    env->ReleaseStringUTFChars(j_str, c_str);
    env->ReleaseStringUTFChars(j_str1,c_str1);

     return env->NewStringUTF(response.dump().data());

}




JNIEXPORT jstring JNICALL Java_com_vrv_ortc_ORTC_getRecvRtpCapabilities(
        JNIEnv* env,jclass cls, jstring j_str) {

    const char *c_str =NULL;
    c_str = env->GetStringUTFChars(j_str, NULL);

    nlohmann::json  local=  nlohmann::json::parse(c_str);


    nlohmann::json response=  mediasoupclient::ortc::getRecvRtpCapabilities(local);

    env->ReleaseStringUTFChars(j_str,c_str);
//    return env->NewStringUTF(response.get<std::string>().data());
    return env->NewStringUTF(response.dump().data());
}



JNIEXPORT jstring JNICALL Java_com_vrv_ortc_ORTC_getSendingRtpParameters( JNIEnv *env,
                                                                         jclass cls, jstring j_str, jstring j_str1){

    const char *c_str = NULL;
    c_str = env->GetStringUTFChars(j_str, NULL);
    std::string kind = c_str;

    const char *c_str1 =NULL;
    c_str1 =env->GetStringUTFChars(j_str1, NULL);

    nlohmann::json  local=  nlohmann::json::parse(c_str1);



    nlohmann::json response = mediasoupclient::ortc::getSendingRtpParameters(kind,local);

    env->ReleaseStringUTFChars(j_str, c_str);

    env->ReleaseStringUTFChars(j_str1,c_str1);
    return env->NewStringUTF(response.dump().data());

}

JNIEXPORT jstring JNICALL Java_com_vrv_ortc_ORTC_getSendingRemoteRtpParameters( JNIEnv *env,
                                                                               jclass cls, jstring j_str, jstring j_str1){
    const char *c_str = NULL;
    c_str = env->GetStringUTFChars(j_str, NULL);


    const char *c_str1 =NULL;
    c_str1 =env->GetStringUTFChars(j_str1, NULL);

    std::string locstr = c_str;
    nlohmann::json  remote=  nlohmann::json::parse(c_str1);


    nlohmann::json response = mediasoupclient::ortc::getSendingRemoteRtpParameters(locstr,remote);

    env->ReleaseStringUTFChars(j_str, c_str);

    env->ReleaseStringUTFChars(j_str1,c_str1);

    return env->NewStringUTF(response.dump().data());

}

JNIEXPORT jboolean JNICALL Java_com_vrv_ortc_ORTC_canReceive(JNIEnv *env,
                                                           jclass cls, jstring j_str, jstring j_str1){
    const char *c_str = NULL;
    c_str = env->GetStringUTFChars(j_str, NULL);


    const char *c_str1 =NULL;
    c_str1 =env->GetStringUTFChars(j_str1, NULL);





    nlohmann::json  local=  nlohmann::json::parse(c_str);
    nlohmann::json  remote=  nlohmann::json::parse(c_str1);


    bool response = mediasoupclient::ortc::canReceive(local,remote);

    env->ReleaseStringUTFChars(j_str, c_str);

    env->ReleaseStringUTFChars(j_str1,c_str1);
//    return env->NewStringUTF(c_str);
    return response;
}



JNIEXPORT jboolean JNICALL Java_com_vrv_ortc_ORTC_canSend(JNIEnv *env,
                                                        jclass cls, jstring j_str, jstring j_str1){
    const char *c_str = NULL;
    c_str = env->GetStringUTFChars(j_str, NULL);
    std::string locstr = c_str;

    const char *c_str1 =NULL;
    c_str1 =env->GetStringUTFChars(j_str1, NULL);

    nlohmann::json  remote=  nlohmann::json::parse(c_str1);


    bool response = mediasoupclient::ortc::canSend(locstr,remote);

    env->ReleaseStringUTFChars(j_str, c_str);

    env->ReleaseStringUTFChars(j_str1,c_str1);
//    return env->NewStringUTF(c_str);
    return response;

}
}






//JNIEXPORT jstring JNICALL Java_com_example_myapplication_MainActivity_stringFromJNI(
//        JNIEnv* env,
//        jclass cls, jstring j_str) {
//
//    const char *c_str =NULL;
//    c_str = env->GetStringUTFChars(j_str, NULL);
//    std::string cstr=c_str;
//
//
//    nlohmann::json response=  mediasoupclient::ortc::getExtendedRtpCapabilities11(cstr,cstr);
//
//    env->ReleaseStringUTFChars(j_str,c_str);
//    return env->NewStringUTF(c_str);
// //   return env->NewStringUTF(response.get<std::string>().data());
////    return env->NewStringUTF(response.dump().data());
//}
