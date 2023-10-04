package com.example.myapp;
import android.content.Context;
        import android.view.LayoutInflater;
        import android.view.View;
        import android.view.ViewGroup;
        import android.widget.ArrayAdapter;
        import android.widget.ImageView;
        import android.widget.TextView;

        import androidx.annotation.NonNull;
        import androidx.annotation.Nullable;

        import java.util.List;

public class ToDoAdapter extends ArrayAdapter<ToDo> {

    private Context context;
    private int resource;
    List<ToDo> todos;

    ToDoAdapter(Context context, int resource, List<ToDo> todos){
        super(context,resource,todos);
        this.context = context;
        this.resource = resource;
        this.todos = todos;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View row = inflater.inflate(resource,parent,false);

        TextView title = row.findViewById(R.id.title);
        TextView description = row.findViewById(R.id.description);
        TextView age = row.findViewById(R.id.editTextAge);
        TextView gender = row.findViewById(R.id.gender);

        ToDo toDo = todos.get(position);
        title.setText(toDo.getTitle());
        description.setText(toDo.getDescription());
      //  age.setText(String.valueOf(toDo.getAge()));  //age
        gender.setText(toDo.getGender());


        return row;
    }
}
