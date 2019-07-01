package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.vrv.ortc.ORTC;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class MainActivity extends AppCompatActivity {

    // Used to load the 'native-lib' library on application startup.

     String ss ="{\n" +
             "\"codecs\": [{\n" +
             "\"kind\": \"audio\",\n" +
             "\"mimeType\": \"audio/opus\",\n" +
             "\"clockRate\": 48000,\n" +
             "\"channels\": 2,\n" +
             "\"preferredPayloadType\": 100,\n" +
             "\"parameters\": {},\n" +
             "\"rtcpFeedback\": []\n" +
             "}, {\n" +
             "\"kind\": \"video\",\n" +
             "\"mimeType\": \"video/VP8\",\n" +
             "\"clockRate\": 90000,\n" +
             "\"rtcpFeedback\": [{\n" +
             "\"type\": \"nack\"\n" +
             "}, {\n" +
             "\"type\": \"nack\",\n" +
             "\"parameter\": \"pli\"\n" +
             "}, {\n" +
             "\"type\": \"ccm\",\n" +
             "\"parameter\": \"fir\"\n" +
             "}, {\n" +
             "\"type\": \"goog-remb\"\n" +
             "}, {\n" +
             "\"type\": \"transport-cc\"\n" +
             "}],\n" +
             "\"preferredPayloadType\": 101,\n" +
             "\"parameters\": {\n" +
             "\"x-google-start-bitrate\": 1000\n" +
             "}\n" +
             "}, {\n" +
             "\"kind\": \"video\",\n" +
             "\"mimeType\": \"video/rtx\",\n" +
             "\"preferredPayloadType\": 102,\n" +
             "\"clockRate\": 90000,\n" +
             "\"rtcpFeedback\": [],\n" +
             "\"parameters\": {\n" +
             "\"apt\": 101\n" +
             "}\n" +
             "}, {\n" +
             "\"kind\": \"video\",\n" +
             "\"mimeType\": \"video/H264\",\n" +
             "\"clockRate\": 90000,\n" +
             "\"parameters\": {\n" +
             "\"packetization-mode\": 1,\n" +
             "\"level-asymmetry-allowed\": 1,\n" +
             "\"profile-level-id\": \"4d0032\",\n" +
             "\"x-google-start-bitrate\": 1000\n" +
             "},\n" +
             "\"rtcpFeedback\": [{\n" +
             "\"type\": \"nack\"\n" +
             "}, {\n" +
             "\"type\": \"nack\",\n" +
             "\"parameter\": \"pli\"\n" +
             "}, {\n" +
             "\"type\": \"ccm\",\n" +
             "\"parameter\": \"fir\"\n" +
             "}, {\n" +
             "\"type\": \"goog-remb\"\n" +
             "}, {\n" +
             "\"type\": \"transport-cc\"\n" +
             "}],\n" +
             "\"preferredPayloadType\": 103\n" +
             "}, {\n" +
             "\"kind\": \"video\",\n" +
             "\"mimeType\": \"video/rtx\",\n" +
             "\"preferredPayloadType\": 104,\n" +
             "\"clockRate\": 90000,\n" +
             "\"rtcpFeedback\": [],\n" +
             "\"parameters\": {\n" +
             "\"apt\": 103\n" +
             "}\n" +
             "}, {\n" +
             "\"kind\": \"video\",\n" +
             "\"mimeType\": \"video/H264\",\n" +
             "\"clockRate\": 90000,\n" +
             "\"parameters\": {\n" +
             "\"packetization-mode\": 1,\n" +
             "\"level-asymmetry-allowed\": 1,\n" +
             "\"profile-level-id\": \"42e01f\",\n" +
             "\"x-google-start-bitrate\": 1000\n" +
             "},\n" +
             "\"rtcpFeedback\": [{\n" +
             "\"type\": \"nack\"\n" +
             "}, {\n" +
             "\"type\": \"nack\",\n" +
             "\"parameter\": \"pli\"\n" +
             "}, {\n" +
             "\"type\": \"ccm\",\n" +
             "\"parameter\": \"fir\"\n" +
             "}, {\n" +
             "\"type\": \"goog-remb\"\n" +
             "}, {\n" +
             "\"type\": \"transport-cc\"\n" +
             "}],\n" +
             "\"preferredPayloadType\": 105\n" +
             "}, {\n" +
             "\"kind\": \"video\",\n" +
             "\"mimeType\": \"video/rtx\",\n" +
             "\"preferredPayloadType\": 106,\n" +
             "\"clockRate\": 90000,\n" +
             "\"rtcpFeedback\": [],\n" +
             "\"parameters\": {\n" +
             "\"apt\": 105\n" +
             "}\n" +
             "}],\n" +
             "\"headerExtensions\": [{\n" +
             "\"kind\": \"audio\",\n" +
             "\"uri\": \"urn:ietf:params:rtp-hdrext:sdes:mid\",\n" +
             "\"preferredId\": 1,\n" +
             "\"preferredEncrypt\": false,\n" +
             "\"direction\": \"recvonly\"\n" +
             "}, {\n" +
             "\"kind\": \"video\",\n" +
             "\"uri\": \"urn:ietf:params:rtp-hdrext:sdes:mid\",\n" +
             "\"preferredId\": 1,\n" +
             "\"preferredEncrypt\": false,\n" +
             "\"direction\": \"recvonly\"\n" +
             "}, {\n" +
             "\"kind\": \"video\",\n" +
             "\"uri\": \"urn:ietf:params:rtp-hdrext:sdes:rtp-stream-id\",\n" +
             "\"preferredId\": 2,\n" +
             "\"preferredEncrypt\": false,\n" +
             "\"direction\": \"recvonly\"\n" +
             "}, {\n" +
             "\"kind\": \"video\",\n" +
             "\"uri\": \"urn:ietf:params:rtp-hdrext:sdes:repaired-rtp-stream-id\",\n" +
             "\"preferredId\": 3,\n" +
             "\"preferredEncrypt\": false,\n" +
             "\"direction\": \"recvonly\"\n" +
             "}, {\n" +
             "\"kind\": \"audio\",\n" +
             "\"uri\": \"http://www.webrtc.org/experiments/rtp-hdrext/abs-send-time\",\n" +
             "\"preferredId\": 4,\n" +
             "\"preferredEncrypt\": false,\n" +
             "\"direction\": \"sendrecv\"\n" +
             "}, {\n" +
             "\"kind\": \"video\",\n" +
             "\"uri\": \"http://www.webrtc.org/experiments/rtp-hdrext/abs-send-time\",\n" +
             "\"preferredId\": 4,\n" +
             "\"preferredEncrypt\": false,\n" +
             "\"direction\": \"sendrecv\"\n" +
             "}, {\n" +
             "\"kind\": \"audio\",\n" +
             "\"uri\": \"http://www.ietf.org/id/draft-holmer-rmcat-transport-wide-cc-extensions-01\",\n" +
             "\"preferredId\": 5,\n" +
             "\"preferredEncrypt\": false,\n" +
             "\"direction\": \"inactive\"\n" +
             "}, {\n" +
             "\"kind\": \"video\",\n" +
             "\"uri\": \"http://www.ietf.org/id/draft-holmer-rmcat-transport-wide-cc-extensions-01\",\n" +
             "\"preferredId\": 5,\n" +
             "\"preferredEncrypt\": false,\n" +
             "\"direction\": \"inactive\"\n" +
             "}, {\n" +
             "\"kind\": \"video\",\n" +
             "\"uri\": \"http://tools.ietf.org/html/draft-ietf-avtext-framemarking-07\",\n" +
             "\"preferredId\": 6,\n" +
             "\"preferredEncrypt\": false,\n" +
             "\"direction\": \"sendrecv\"\n" +
             "}, {\n" +
             "\"kind\": \"video\",\n" +
             "\"uri\": \"urn:ietf:params:rtp-hdrext:framemarking\",\n" +
             "\"preferredId\": 7,\n" +
             "\"preferredEncrypt\": false,\n" +
             "\"direction\": \"sendrecv\"\n" +
             "}, {\n" +
             "\"kind\": \"audio\",\n" +
             "\"uri\": \"urn:ietf:params:rtp-hdrext:ssrc-audio-level\",\n" +
             "\"preferredId\": 10,\n" +
             "\"preferredEncrypt\": false,\n" +
             "\"direction\": \"sendrecv\"\n" +
             "}, {\n" +
             "\"kind\": \"video\",\n" +
             "\"uri\": \"urn:3gpp:video-orientation\",\n" +
             "\"preferredId\": 11,\n" +
             "\"preferredEncrypt\": false,\n" +
             "\"direction\": \"sendrecv\"\n" +
             "}, {\n" +
             "\"kind\": \"video\",\n" +
             "\"uri\": \"urn:ietf:params:rtp-hdrext:toffset\",\n" +
             "\"preferredId\": 12,\n" +
             "\"preferredEncrypt\": false,\n" +
             "\"direction\": \"sendrecv\"\n" +
             "}],\n" +
             "\"fecMechanisms\": []\n" +
             "}";




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Example of a call to a native method
       final TextView tv = findViewById(R.id.sample_text);



        tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv.setText(ORTC.getExtendedRtpCapabilities(ss,ss));

            }
        });



        }

    /**
     * A native method that is implemented by the 'native-lib' native library,
     * which is packaged with this application.
     */

//    public native String stringFromJNI1(String s);

}
