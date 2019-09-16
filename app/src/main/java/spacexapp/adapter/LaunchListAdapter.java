package spacexapp.adapter;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.spacexapp.R;

import java.util.ArrayList;
import java.util.List;

import spacexapp.model.Launch;
import spacexapp.util.Utils;

public class LaunchListAdapter extends RecyclerView.Adapter<LaunchListAdapter.LaunchListViewHolder> {

    private List<Launch> launchList = new ArrayList<>();
    private ItemClickListener mClickListener;
    private Context context;
    private View lastSelected;

    public LaunchListAdapter() {
    }

    @NonNull
    @Override
    public LaunchListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        context = parent.getContext();
        View view = LayoutInflater.from(context).inflate(R.layout.launch_list_item, parent, false);
        return new LaunchListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull LaunchListViewHolder holder, int position) {
        Launch launch = launchList.get(position);
        holder.setItems(launch);
    }

    @Override
    public int getItemCount() {
        return launchList.size();
    }

    public void loadList(List<Launch> launchList) {
        if (this.launchList.size() > 0) {
            addToList(launchList);
        } else {
            this.launchList = launchList;
            notifyItemRangeInserted(0, this.launchList.size());
        }
    }

    private void addToList(List<Launch> launchList) {
        this.launchList.addAll(launchList);
        notifyItemRangeInserted(getItemCount() - 1, this.launchList.size());
    }

    public Launch getLaunchItem(int id) {
        return launchList.get(id);
    }

    // allows clicks events to be caught
    public void setClickListener(ItemClickListener itemClickListener) {
        this.mClickListener = itemClickListener;
    }

    public class LaunchListViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        AppCompatImageView ivImagePatch;
        AppCompatTextView tvMissionName, tvRocketName, tvLaunchSiteName, tvDateOfLaunch;

        LaunchListViewHolder(@NonNull View itemView) {
            super(itemView);
            ivImagePatch = itemView.findViewById(R.id.iv_launch_patch);
            tvMissionName = itemView.findViewById(R.id.tv_mission_name);
            tvRocketName = itemView.findViewById(R.id.tv_rocket_name);
            tvLaunchSiteName = itemView.findViewById(R.id.tv_launch_site_name);
            tvDateOfLaunch = itemView.findViewById(R.id.tv_date_of_launch);
            itemView.setOnClickListener(this);
        }

        void setItems(Launch launch) {
            Glide.with(context)
                    .load(launch.getLinks().getMissionPatchSmall())
                    .centerCrop()
                    .placeholder(R.drawable.nasa_patch)
                    .into(ivImagePatch);
            tvMissionName.setText(launch.getMissionName());
            tvRocketName.setText(launch.getRocket().getRocketName());
            tvLaunchSiteName.setText(launch.getLaunchSite().getSiteName());
            String formattedDate = Utils.formatStringUtcDate(launch.getLaunchDateUtc());
            tvDateOfLaunch.setText(formattedDate);
        }

        @Override
        public void onClick(View view) {
            if (mClickListener != null) {
                mClickListener.onItemClick(view, getAdapterPosition());
                view.setBackgroundColor(ContextCompat.getColor(context, R.color.colorAccent));
                if (lastSelected != null) lastSelected.setBackgroundColor(ContextCompat.getColor(context, R.color.white));
                lastSelected = view;
            }
        }
    }

    // parent activity will implement this method to respond to click events
    public interface ItemClickListener {
        void onItemClick(View view, int position);
    }
}
