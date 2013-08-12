package om.we7aura.library.log;

public class MyLog {
	// TODO set false in below variable "LOG" for market upload
    static boolean LOG = true;

    public static boolean isLOG() {
		return LOG;
	}
	public static void setLOG(boolean lOG) {
		LOG = lOG;
	}
	
	public static void a(String tag, String string) {
        android.util.Log.i(tag, string);
    }
	
	public static void i(String tag, String string) {
        if (LOG) android.util.Log.i(tag, string);
    }
    public static void e(String tag, String string) {
        if (LOG && (!tag.equalsIgnoreCase("imageloader"))) android.util.Log.e(tag, string);
    }
    public static void d(String tag, String string) {
        if (LOG) android.util.Log.d(tag, string);
    }
    public static void v(String tag, String string) {
        if (LOG) android.util.Log.v(tag, string);
    }
    public static void w(String tag, String string) {
        if (LOG) android.util.Log.w(tag, string);
    }
	public static void e(String tag, String string, Exception e) {
		if (LOG && (!tag.equalsIgnoreCase("imageloader"))) android.util.Log.e(tag, string+" : "+e.getMessage());
	}
	public static void function(String string) {
        if (LOG) android.util.Log.i("Function", string);
    }
}
