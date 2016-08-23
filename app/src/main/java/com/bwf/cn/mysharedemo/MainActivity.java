package com.bwf.cn.mysharedemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.umeng.socialize.ShareAction;
import com.umeng.socialize.UMShareAPI;
import com.umeng.socialize.UMShareListener;
import com.umeng.socialize.bean.SHARE_MEDIA;
import com.umeng.socialize.media.UMImage;

public class MainActivity extends AppCompatActivity implements View.OnClickListener,UMShareListener{
    private  Button qq_share,qz_share,QQlogin;
    private UMShareAPI shareAPI;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        shareAPI = UMShareAPI.get(this);
        qq_share = (Button) findViewById(R.id.qq_share);//@+id/qq_share
        qz_share = (Button) findViewById(R.id.qz_share);//@+id/qz_share
        QQlogin = (Button) findViewById(R.id.QQlogin);
        qq_share.setOnClickListener(this);
        qz_share.setOnClickListener(this);
        QQlogin.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.qq_share :
                ShareAction shareAction = new ShareAction(MainActivity.this);
                shareAction.setPlatform(SHARE_MEDIA.QQ);
                shareAction.withTitle("分享至QQ");
                shareAction.withText("分享至QQ好友");
                shareAction.withTargetUrl("http://www.baidu.com");
                shareAction.withMedia(new UMImage(this,"http://p1.qhimg.com/t0151320b1d0fc50be8.png"));
                shareAction.setCallback(this);
                shareAction.share();
            break;
            case R.id.qz_share:
                ShareAction shareAction1 = new ShareAction(this);
                shareAction1.setPlatform(SHARE_MEDIA.QZONE);
                shareAction1.withTitle("分享至QQ空间");
                shareAction1.withText("分享至QQ空间");
                shareAction1.withTargetUrl("http://www.baidu.com");
                shareAction1.withMedia(new UMImage(this,"http://p1.qhimg.com/t0151320b1d0fc50be8.png"));
                shareAction1.setCallback(this);
                shareAction1.share();
                break;
            case R.id.QQlogin:
                //shareAPI.doOauthVerify(this,SHARE_MEDIA.QQ,);
            break;
        }
    }

    @Override
    public void onResult(SHARE_MEDIA share_media) {
        Toast.makeText(this,"分享成功",Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onError(SHARE_MEDIA share_media, Throwable throwable) {
        Toast.makeText(this,"分享失败",Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onCancel(SHARE_MEDIA share_media) {
        Toast.makeText(this,"分享取消",Toast.LENGTH_SHORT).show();
    }
}
