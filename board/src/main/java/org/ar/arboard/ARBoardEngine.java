package org.ar.arboard;


import org.ar.arboard.utils.DevConfig;

/**
 * Created by liuxiaozhong on 2018/9/28.
 */
public class ARBoardEngine {


    private static class SingletonHolder {
        private static final ARBoardEngine INSTANCE = new ARBoardEngine();
    }

    public static final ARBoardEngine Inst() {
        return SingletonHolder.INSTANCE;
    }

    private ARBoardEngine() {
    }

    public void initEngineWithARInfo(final String strAppId,
                                       final String strToken) {
        DevConfig.getInstance().initARInfo(strAppId,strToken);
    }

    public String getSdkVersion() {
        return BuildConfig.VERSION_NAME;
    }

    public void setDebugLog(boolean open){
        DevConfig.getInstance().setOpenLog(open);
    }

}
