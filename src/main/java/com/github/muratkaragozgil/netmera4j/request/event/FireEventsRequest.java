package com.github.muratkaragozgil.netmera4j.request.event;

import lombok.*;
import com.github.muratkaragozgil.netmera4j.util.NotEmpty;

import java.util.List;

/**
 * @author Murat Karagözgil
 */
@Getter
@Setter
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class FireEventsRequest {
    @NotEmpty
    private List<SingleEvent> eventList;
}
