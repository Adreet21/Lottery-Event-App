package com.example.event_lottery;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import android.content.Context;

import com.google.firebase.firestore.FirebaseFirestore;
import android.view.View;

import androidx.annotation.NonNull;

import java.util.List;
import androidx.annotation.Nullable;

public class AdminUserAdapter extends ArrayAdapter<User> {
    /**
     * Constructor for AdminUserAdapter.
     *
     * @param context The current context.
     * @param users The list of users to represent in the ListView.
     */
    public AdminUserAdapter(Context context, List<User> users) {
        super(context, 0, users);
    }

    /**
     * Provides a view for an adapter view (ListView, GridView, etc.).
     *
     * @param position The position of the item within the adapter's data set.
     * @param convertView The old view to reuse, if possible.
     * @param parent The parent that this view will eventually be attached to.
     * @return A View corresponding to the data at the specified position.
     */
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.admin_list_item_user, parent, false);
        }

        User user = getItem(position);

        TextView userNameTextView = convertView.findViewById(R.id.user_name);
        TextView roleTextView = convertView.findViewById(R.id.role);

        // set user data
        userNameTextView.setText(user.getEmail());
        roleTextView.setText(user.getRole());

        // details Button
        Button detailsButton = convertView.findViewById(R.id.details_button);
        detailsButton.setOnClickListener(v -> {
            Intent intent = new Intent(getContext(), AdminUserDetailsActivity.class);
            intent.putExtra("userId", user.getId());
            intent.putExtra("email", user.getEmail());
            intent.putExtra("username", user.getUsername());
            intent.putExtra("fullName", user.getFirstName() + " " + user.getLastName());
            intent.putExtra("role", user.getRole());
            getContext().startActivity(intent);
        });

        return convertView;
    }
}
