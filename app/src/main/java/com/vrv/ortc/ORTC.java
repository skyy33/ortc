package com.vrv.ortc;

public class ORTC {


    static {
        System.loadLibrary("ortc-lib");
    }




    //warp
    public static native String getExtendedRtpCapabilities(String loaclCapsJson, String remoteCapsJson);

    public static native String getRecvRtpCapabilities(String extendedRtpCapabilities);

    public static native String getSendingRtpParameters(String kind, String extendedRtpCapabilities);

    public static native String getSendingRemoteRtpParameters(String kind, String extendedRtpCapabilities);

    public static native boolean canSend(String kind, String extendedRtpCapabilities);
    public static native boolean canReceive(String rtpParameters, String extendedRtpCapabilities);
}
