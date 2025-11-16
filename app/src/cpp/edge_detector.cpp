#include <jni.h>
#include <android/log.h>
#define LOG_TAG "EdgeDetector"
#define LOGI(...) __android_log_print(ANDROID_LOG_INFO, LOG_TAG, __VA_ARGS__)
extern "C" {
JNIEXPORT void JNICALL
Java_com_flam_edgedetection_EdgeDetectionActivity_processFrame(JNIEnv* env, jobject thiz) {
    LOGI("Edge detection ready for OpenCV");
}
}
