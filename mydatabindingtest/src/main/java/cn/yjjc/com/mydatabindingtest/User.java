package cn.yjjc.com.mydatabindingtest;

import android.databinding.BindingAdapter;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

/**
 * Created by chen on 2016/7/12 0012.
 */
public class User {
    private String name;
    private int age;
    private String imageUrl;

    public User(){}

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    @BindingAdapter({"bind:imageUrl", "bind:error"})
    public static void loadImage(ImageView view, String imageUrl, Drawable error) {
        Picasso.with(view.getContext()).load(imageUrl).error(error).into(view);
//        new PicassoImageLoadManager().load(view.getContext(), imageUrl, view, R.mipmap.ic_launcher, new Callback() {
//            @Override
//            public void onSuccess() {
//                Log.i("tag", "onSuccess");
//            }
//
//            @Override
//            public void onError() {
//                Log.i("tag", "onError");
//            }
//        });
    }
}
