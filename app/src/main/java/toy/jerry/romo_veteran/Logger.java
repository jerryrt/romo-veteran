package toy.jerry.romo_veteran;

import android.util.Log;

/**
 * Created by jerry on 7/28/14.
 */
public class Logger {

    public static final void logDebug(Object sender, String msg) {
        Log.d(sender.getClass().getSimpleName(), msg);
    }

    public static final void logVerbose(Object sender, String msg) {
        Log.v(sender.getClass().getSimpleName(), msg);
    }

    public static final void logInfo(Object sender, String msg) {
        Log.i(sender.getClass().getSimpleName(), msg);
    }


    public static final void logWarn(Object sender, String msg) {
        Log.w(sender.getClass().getSimpleName(), msg);
    }

    public static final void logError(Object sender, String msg) {
        Log.e(sender.getClass().getSimpleName(), msg);
    }

    ////
    public static final void logDebug(Object sender, String msg, Throwable t) {
        Log.d(sender.getClass().getSimpleName(), msg, t);
    }

    public static final void logVerbose(Object sender, String msg, Throwable t) {
        Log.v(sender.getClass().getSimpleName(), msg, t);
    }

    public static final void logInfo(Object sender, String msg, Throwable t) {
        Log.i(sender.getClass().getSimpleName(), msg, t);
    }


    public static final void logWarn(Object sender, String msg, Throwable t) {
        Log.w(sender.getClass().getSimpleName(), msg, t);
    }

    public static final void logError(Object sender, String msg, Throwable t) {
        Log.e(sender.getClass().getSimpleName(), msg, t);
    }
}

