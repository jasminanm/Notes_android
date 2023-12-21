package pt.iade.nayukamalebo.atividade;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

import pt.iade.nayukamalebo.atividade.NoteItem;

public class NoteItemAdapter extends RecyclerView.Adapter<NoteItemAdapter.ViewHolder> {

    private final List<NoteItem> noteList;

    public NoteItemAdapter(List<NoteItem> noteList) {
        this.noteList = noteList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_note_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        NoteItem note = noteList.get(position);
        holder.titleTextView.setText(note.getTitle());
        holder.summaryTextView.setText(getSummary(note.getContent()));
    }

    @Override
    public int getItemCount() {
        return noteList.size();
    }

    private String getSummary(String content) {
        // Implement logic to get a summary from the content if needed
        return content.substring(0, Math.min(content.length(), 50)); // Displaying the first 50 characters as a summary
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        TextView titleTextView;
        TextView summaryTextView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            titleTextView = itemView.findViewById(Integer.parseInt("R.id.textViewTitle"));
            summaryTextView = itemView.findViewById(Integer.parseInt("R.id.textViewSummary"));
        }
    }
}

