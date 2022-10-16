package com.example.api_playground;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class AdapterView extends RecyclerView.Adapter<AdapterView.ViewHolder> {

    public List<Person> personList;

    public AdapterView(){
    }

    @NonNull
    @Override
    public AdapterView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View layout = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_name,parent,false);
        return new ViewHolder(layout,parent.getContext());
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterView.ViewHolder holder, int position) {
        Person person = this.personList.get(position);
        holder.setNamePerson(person.getName());
    }

    @Override
    public int getItemCount() {
        if(this.personList != null){
            return this.personList.size();
        }
        return 0;
    }

    public void updateList(List<Person> personList){
        this.personList = personList;
        notifyDataSetChanged();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private TextView namePerson;
        private Context context;
        public ViewHolder(@NonNull View itemView, Context context) {
            super(itemView);
            this.namePerson = itemView.findViewById(R.id.textViewNameRow);
            this.context = context;
        }

        public void setNamePerson(String name){
            this.namePerson.setText(name);
        }
    }
}
