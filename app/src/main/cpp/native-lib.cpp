//
// Created by xjl on 2017/1/22.
//

#include <jni.h>
#include "Max.h"

extern "C"
{
    jint
    Java_com_langyang_xjl_ndktest2_MainActivity_maxFromJNI(JNIEnv* env,jobject object,jint a,jint b){
        return max(a,b);
    }

}