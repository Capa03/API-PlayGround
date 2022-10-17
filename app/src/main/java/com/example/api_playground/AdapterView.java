package com.example.api_playground;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class AdapterView extends RecyclerView.Adapter<AdapterView.ViewHolder> {

    public List<Person> personList = new ArrayList<>();

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
        holder.setHeigth(person.getHeight());
        holder.setBirthYear(person.getBirthYear());
        holder.setGender(person.getGender());
    }

    @Override
    public int getItemCount() {
            return this.personList.size();
    }

    public void updateList(List<Person> personList){
        this.personList = personList;
        notifyDataSetChanged();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private TextView namePerson;
        private TextView heigth;
        private TextView birthYear;
        private TextView gender;
        private Context context;
        public ViewHolder(@NonNull View itemView, Context context) {
            super(itemView);
            this.namePerson = itemView.findViewById(R.id.textViewNameRow);
            this.heigth = itemView.findViewById(R.id.textViewHeigth);
            this.birthYear = itemView.findViewById(R.id.textViewBirthYear);
            this.gender = itemView.findViewById(R.id.textViewGender);
            this.context = context;
        }

        public void setNamePerson(String name){
            this.namePerson.setText("Name: " + name);
        }

        public void setHeigth(String heigth) {
            this.heigth.setText("Height: " + heigth);
        }

        public void setBirthYear(String birthYear) {
            this.birthYear.setText("BirthYear: " + birthYear);
        }

        public void setGender(String gender){
            this.gender.setText("Gender: " + gender);
        }
    }
}
