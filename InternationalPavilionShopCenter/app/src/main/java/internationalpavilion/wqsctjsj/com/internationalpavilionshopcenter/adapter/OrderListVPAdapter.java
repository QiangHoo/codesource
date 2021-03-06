package internationalpavilion.wqsctjsj.com.internationalpavilionshopcenter.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;



import java.util.List;

import internationalpavilion.wqsctjsj.com.internationalpavilionshopcenter.entitys.TabItemBean;


public class OrderListVPAdapter extends FragmentPagerAdapter {
    // table导航条里面的内容填充
    private List<TabItemBean> tabList;
    private List<Fragment>fgList;
    private FragmentManager manager;

    public OrderListVPAdapter(FragmentManager fm, List<Fragment>fgList) {
        super(fm);
        this.manager=fm;
        this.fgList=fgList;
    }

    @Override
    public Fragment getItem(int position) {
        return fgList.get(position);
    }

    @Override
    public int getCount() {
        return fgList.size();
    }

}


