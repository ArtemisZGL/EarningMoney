package com.example.asus.earingmoney.adapter;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.asus.earingmoney.R;
import com.example.asus.earingmoney.model.MissionModel;
import com.example.asus.earingmoney.model.MissionOrTask;

import java.util.ArrayList;
import java.util.List;

public class MissionOrTaskListAdapter extends BaseAdapter {
    private List<MissionOrTask> list;
    private Context context;
    public MissionOrTaskListAdapter(List<MissionOrTask> list, Context context) {
        this.list = list;
        this.context = context;
    }
    @Override
    public int getCount() {
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public void update() {
        notifyDataSetChanged();
    }


    public void setList(List<MissionOrTask> _list) {
        this.list.clear();
        this.list.addAll(_list);
        update();
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public Object getItem(int i) {
        if (list == null) {
            return null;
        }
        return list.get(i);
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        // 新声明一个View变量和ViewHoleder变量,ViewHolder类在下面定义。
        View convertView;
        ViewHolder viewHolder;
        // 当view为空时才加载布局，否则，直接修改内容
        if (view == null) {
            // 通过inflate的方法加载布局，context需要在使用这个Adapter的Activity中传入。
            convertView= LayoutInflater.from(context).inflate(R.layout.mission_or_task_item, null);
            viewHolder = new ViewHolder();
            viewHolder.avator = (ImageView) convertView.findViewById(R.id.avator);
            viewHolder.title = (TextView) convertView.findViewById(R.id.titleText);
            viewHolder.publishTime = (TextView) convertView.findViewById(R.id.publishTimeText);
            viewHolder.deadLine = (TextView) convertView.findViewById(R.id.deadLineText);
            viewHolder.description = (TextView) convertView.findViewById(R.id.descriptionText);
            viewHolder.missionStatus = (TextView) convertView.findViewById(R.id.missionStatusText);
            viewHolder.taskNum = (TextView) convertView.findViewById(R.id.taskNumText);
            viewHolder.money = (TextView) convertView.findViewById(R.id.moneyText);
            convertView.setTag(viewHolder); // 用setTag方法将处理好的viewHolder放入view中
        } else {
            // 否则，让convertView等于view，然后从中取出ViewHolder即可
            convertView = view;
            viewHolder = (ViewHolder) convertView.getTag();
        }
        // 从viewHolder中取出对应的对象，然后赋值给他们
        if (list.get(i).isMission()) {
            viewHolder.avator.setImageResource(R.mipmap.me);
            viewHolder.title.setText(((MissionModel)list.get(i)).getTitle());
            viewHolder.publishTime.setText("起:"+((MissionModel)list.get(i)).getPublishTime());
            viewHolder.deadLine.setText("止:"+((MissionModel)list.get(i)).getDeadLine());

            viewHolder.missionStatus.setText("状态");
            viewHolder.taskNum.setText("需" + ((MissionModel)list.get(i)).getTaskNum() + "人");
            viewHolder.money.setText("奖励金:" + ((MissionModel)list.get(i)).getMoney());
            viewHolder.description.setText(((MissionModel)list.get(i)).getDescription());
        }


        // 将这个处理好的view返回
        return convertView;
    }

    private class ViewHolder {
        public ImageView avator;
        public TextView title;
        public TextView publishTime;
        public TextView deadLine;
        public TextView description;
        public TextView missionStatus;
        public TextView taskNum;
        public TextView money;
    }
}
