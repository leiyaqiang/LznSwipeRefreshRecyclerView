package com.android4.lenovo.lznswiperefreshrecyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.android4.lenovo.lznswiperefreshrecyclerview.beans.CategoryBean;
import com.android4.lenovo.lznswiperefreshrecyclerview.fragments.ContentListFragment;
import com.android4.lenovo.lznswiperefreshrecyclerview.utils.FragmentUtils;


public class MainActivity extends AppCompatActivity {
    private ContentListFragment mContentListFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        CategoryBean categoryBean = new CategoryBean();

        categoryBean.setCategoryId(1);
        categoryBean.setCategoryName("分类");
        categoryBean.setSubclassCount(5);

        mContentListFragment = ContentListFragment.newInstance(categoryBean);
        FragmentUtils.addFragmentToActivity(getSupportFragmentManager(),
                                            mContentListFragment,
                                            R.id.fl_fragment_container);

    }
}
