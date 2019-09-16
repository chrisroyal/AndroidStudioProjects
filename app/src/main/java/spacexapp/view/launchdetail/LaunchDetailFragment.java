package spacexapp.view.launchdetail;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.fragment.app.Fragment;

import com.bumptech.glide.Glide;
import com.example.spacexapp.R;

import spacexapp.model.Launch;

/**
 * A simple {@link Fragment} subclass.
 */
public class LaunchDetailFragment extends Fragment {

    private AppCompatImageView ivImagePatch, ivClose;
    private AppCompatTextView tvLaunchDetails;
    private Context context;
    private OnFragmentInteractionListener mListener;

    public LaunchDetailFragment() {
        // Required empty public constructor
    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        if (context instanceof OnFragmentInteractionListener) {
            this.context = context;
            mListener = (OnFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_launch_detail, container, false);
        ivImagePatch = view.findViewById(R.id.iv_launch_patch);
        tvLaunchDetails = view.findViewById(R.id.tv_launch_details);
        ivClose = view.findViewById(R.id.iv_close);
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        ivClose.setOnClickListener(view1 -> mListener.closeDetails());
    }

    public void loadDetails(Launch launch) {
        Glide.with(context)
                .load(launch.getLinks().getMissionPatchSmall())
                .fitCenter()
                .placeholder(R.drawable.nasa_patch)
                .into(ivImagePatch);
        tvLaunchDetails.setText(launch.getDetails());
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    public interface OnFragmentInteractionListener {
        void closeDetails();
    }
}