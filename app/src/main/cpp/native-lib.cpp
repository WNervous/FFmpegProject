#include <jni.h>
#include <string>

extern "C" {
#include <libavformat/avformat.h>
}
extern "C" JNIEXPORT jstring JNICALL
Java_com_wys_ffmpegproject_MainActivity_stringFromJNI(
        JNIEnv *env,
        jobject /* this */) {
    std::string hello = av_version_info();
    return env->NewStringUTF(hello.c_str());
}
