package org.example.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class todoResponse {
    private Long id;
    private String title;
    private Long order;
    private Boolean completed;
    private String url;

    public todoResponse(todoEntity todoEntity) {
        this.id = id;
        this.title = title;
        this.order = order;
        this.completed = completed;
        this.url = "http://localhost:8080/"+this.id;
    }
}
