package com.example.android.miwok;

import android.app.Activity;
import android.content.Context;
import android.media.Image;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class WordAdapter extends ArrayAdapter<Word> {


    public WordAdapter(@NonNull Context context, int resource, ArrayList<Word> words) {
        super(context, 0, words);

    }

    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }
        Word currentWord =getItem(position);
        TextView miwokTextView = (TextView) listItemView.findViewById(R.id.miwok_text_view);
        // set this text on the name TextView
        miwokTextView.setText(currentWord.getmMiwokTranslation());

        TextView defaultTextView = (TextView) listItemView.findViewById(R.id.default_text_view);

        defaultTextView.setText(currentWord.getmDefaultTranslation());

            ImageView imageView = (ImageView) listItemView.findViewById(R.id.word_image_view);
        if(currentWord.getImageResourceID()!=0) {
            imageView.setImageResource(currentWord.getImageResourceID());
        }
        else
            imageView.setVisibility(View.GONE);


        // Return the whole list item layout (containing 2 TextViews and 1 ImageView)
        // so that it can be shown in the ListView
        // Set the theme color for the list item

        return listItemView;

    }
}
