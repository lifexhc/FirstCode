package com.xuhongchuan.fragmentbestpractice;

import android.app.Activity;
import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by xuhongchuan on 16/5/15.
 */
public class NewsTitleFragment extends Fragment implements AdapterView.OnItemClickListener {

    private ListView newsTitleListView;
    private List<News> newsList;
    private NewsAdapter adapter;
    private boolean isTwoPane;

    @Override
    public void onAttach(Activity context) {
        super.onAttach(context);
        newsList = getNews();
        adapter = new NewsAdapter(context, R.layout.news_item, newsList);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.news_title_frag, container, false);
        newsTitleListView = (ListView) view.findViewById(R.id.news_title_list_view);
        newsTitleListView.setAdapter(adapter);
        newsTitleListView.setOnItemClickListener(this);
        return view;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        if (getActivity().findViewById(R.id.news_content_layout) != null) {
            isTwoPane = true;
        } else {
            isTwoPane = false;
        }
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        News news = newsList.get(position);
        if (isTwoPane) {
            NewsContentFragment newsContentFragment = (NewsContentFragment) getFragmentManager()
                    .findFragmentById(R.id.news_content_fragment);
            newsContentFragment.refresh(news.getTitle(), news.getContent());
        } else {
            NewsContentActivity.actionStart(getActivity(), news.getTitle(), news.getContent());
        }
    }

    private List<News> getNews() {
        List<News> newsList = new ArrayList<News>();
        News news1 = new News();
        news1.setTitle("演员");
        news1.setContent("简单点说话的方式简单点\n" +
                "递进的情绪请省略\n" +
                "你又不是个演员\n" +
                "别设计那些情节\n" +
                "没意见我只想看看你怎么圆\n" +
                "你难过的太表面 像没天赋的演员\n" +
                "观众一眼能看见\n" +
                "该配合你演出的我演视而不见\n" +
                "在逼一个最爱你的人即兴表演\n" +
                "什么时候我们开始收起了底线\n" +
                "顺应时代的改变看那些拙劣的表演\n" +
                "可你曾经那么爱我干嘛演出细节\n" +
                "我该变成什么样子才能延缓厌倦\n" +
                "原来当爱放下防备后的这些那些\n" +
                "才是考验");
        News news2 = new News();
        news2.setTitle("一半");
        news2.setContent("多平淡所以自己刻意为难\n" +
                "多遗憾被抛弃的人没喜感\n" +
                "像被人围起来就特别放不开\n" +
                "都在期待角色要坏别委屈了人才\n" +
                "别期待伤人的话变得柔软\n" +
                "也别揭穿剧透的电影不好看\n" +
                "隔墙有只耳朵嘲笑你多难过\n" +
                "你越反驳越像示弱\n" +
                "请别再招惹我\n" +
                "我可以为我们的散承担一半\n" +
                "可我偏要摧毁所有的好感\n" +
                "看上去能孤独的很圆满\n" +
                "我做作的表情让自己很难堪\n" +
                "可感情这玩意儿怎么计算\n" +
                "别两难  hey晚安");
        newsList.add(news1);
        newsList.add(news2);
        return newsList;
    }
}
