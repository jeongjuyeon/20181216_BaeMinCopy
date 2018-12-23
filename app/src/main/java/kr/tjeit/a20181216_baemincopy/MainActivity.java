package kr.tjeit.a20181216_baemincopy;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends BaseActivity {

    LinearLayout koreanFoodBtn;
    LinearLayout bunsikBtn;
    LinearLayout japanesFoodBtn;
    private LinearLayout clzlswBtn;
    private LinearLayout vlwkBtn;
    private LinearLayout wndrnrwlqBtn;
    private LinearLayout whrqkfBtn;
    private LinearLayout qhtkaBtn;
    private LinearLayout xkdBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bindViews();
        setupEvents();
        setValues();

    }


    @Override
    public void setupEvents() {

////        한식 버튼이 눌렸을때 할일.
//        koreanFoodBtn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
////                Toast.makeText(MainActivity.this, "한식을 눌렀습니다.", Toast.LENGTH_SHORT).show();
//
////                한식이 눌렸다는 사실을 레스토랑리스트 액티비티에 공지. (알려줌)
//
//                Intent intent = new Intent(mContext, RestaurantListActivity.class);
//                intent.putExtra("음식종류","한식");
//                startActivity(intent);
//
//            }
//        });



        View.OnClickListener foodKindClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {

//                첫번째 방법 예시
//                if (v.getId() == R.id.clzlswBtn){
//                    Toast.makeText(mContext, "치킨눌림", Toast.LENGTH_SHORT).show();
//                }
//                else if (v.getId() == R.id.vlwkBtn){
//                    Toast.makeText(mContext, " 피자눌림", Toast.LENGTH_SHORT).show();
//                }


//                두번째 방법. XML에 작성한 태그를 이용.
//                Toast.makeText(mContext, v.getTag().toString(), Toast.LENGTH_SHORT).show();


//                인텐트에 어떤 종류의 음식인지 첨부해서 레스토랑 목록화면 이동.

                Intent intent = new Intent(mContext, RestaurantListActivity.class);
                intent.putExtra("음식종류", v.getTag().toString());
                startActivity(intent);


            }
        };




        koreanFoodBtn.setOnClickListener(foodKindClickListener);
        bunsikBtn.setOnClickListener(foodKindClickListener);
        japanesFoodBtn.setOnClickListener(foodKindClickListener);
        clzlswBtn.setOnClickListener(foodKindClickListener);
        vlwkBtn.setOnClickListener(foodKindClickListener);
        wndrnrwlqBtn.setOnClickListener(foodKindClickListener);
        whrqkfBtn.setOnClickListener(foodKindClickListener);
        qhtkaBtn.setOnClickListener(foodKindClickListener);
        xkdBtn.setOnClickListener(foodKindClickListener);


    }

    @Override
    public void setValues() {

    }

    @Override
    public void bindViews() {

//        사실 읽을 필요가 전혀 없는 코드들.
//        따로 메쏘드를 만들어서 밑으로 치워버리자.

        this.xkdBtn = (LinearLayout) findViewById(R.id.xkdBtn);
        this.qhtkaBtn = (LinearLayout) findViewById(R.id.qhtkaBtn);
        this.whrqkfBtn = (LinearLayout) findViewById(R.id.whrqkfBtn);
        this.wndrnrwlqBtn = (LinearLayout) findViewById(R.id.wndrnrwlqBtn);
        this.vlwkBtn = (LinearLayout) findViewById(R.id.vlwkBtn);
        this.clzlswBtn = (LinearLayout) findViewById(R.id.clzlswBtn);
        this.japanesFoodBtn = (LinearLayout) findViewById(R.id.japanesFoodBtn);
        this.bunsikBtn = (LinearLayout) findViewById(R.id.bunsikBtn);
        this.koreanFoodBtn = (LinearLayout) findViewById(R.id.koreanFoodBtn);


    }
}