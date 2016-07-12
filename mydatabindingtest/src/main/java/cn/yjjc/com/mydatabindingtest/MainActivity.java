package cn.yjjc.com.mydatabindingtest;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private cn.yjjc.com.mydatabindingtest.UserBinding binding;
    private String[] names = {"Kimy", "Helly", "Bob", "Tom", "Lucy", "Lily", "Anan"};
    private int[] ages = {6,7,8,9,10,11,12,15,16,17,18,19,20,24,25,26,27,28,29,30};
    private String[] urls = {
            "http://hz-img2.exiuzhuangxiu.net.cn/productPhoto/20160613145938Qd/1.jpg@!w_200",
            "aasdfasfd",
            "http://hz-img2.exiuzhuangxiu.net.cn/productPhoto/20160613144713Ks/1.jpg@!w_200",
            "http://hz-img2.exiuzhuangxiu.net.cn/upload/779318963491728.jpg@!w_200",
            "aasdfasfd",
            "http://hz-img2.exiuzhuangxiu.net.cn/upload/779431702578400.jpg@!w_200",
            "http://hz-img2.exiuzhuangxiu.net.cn/upload/779541318622338.jpg@!w_200",
            "aasdfasfd"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        binding.btnChange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                changeUser();
            }
        });
    }

    private void changeUser() {
        User user = binding.getUser();
        if (user == null) {
            user = new User();
        }
        String name = names[new Random().nextInt(names.length)];
        int age = ages[new Random().nextInt(ages.length)];
        String url = urls[new Random().nextInt(urls.length)];
        user.setName(name);
        user.setAge(age);
        user.setImageUrl(url);
        binding.setUser(user);
    }
}
