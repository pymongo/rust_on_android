package rust.android;

public class RustApi {
    public static native String hello(final String pattern);
    static {
        // librust.so
        System.loadLibrary("rust");

        // java.lang.UnsatisfiedLinkError: dalvik.system.PathClassLoader[DexPathList[[zip file "/data/app/rust.android-8tHAXH7E1f8gBm9plb1FVg==/base.apk"],nativeLibraryDirectories=[/data/app/rust.android-8tHAXH7E1f8gBm9plb1FVg==/lib/x86, /data/app/rust.android-8tHAXH7E1f8gBm9plb1FVg==/base.apk!/lib/x86, /system/lib, /system/product/lib]]]
        // couldn't find "liblibrust.so.so"
        // System.loadLibrary("librust.so");
    }
}
