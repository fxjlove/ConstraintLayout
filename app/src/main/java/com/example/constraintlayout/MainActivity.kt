package com.example.constraintlayout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

//https://blog.csdn.net/zping0808/article/details/83064568
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_case)

        //案例
        //需求:要求产品类型紧跟产品名称后面,当产品名称过长使用“…”省略,不会影响产品类型展示,如下正常效果图. 可使用ConstraintLayout实现,当文字过长时也可以正常展示(如下文字过长效果图)
    }
}
