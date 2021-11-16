package com.tuhungkien.ecommerce.commondataservice.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class SearchSuggestionForTwoAttrDTO implements Serializable {
    Integer attr1_id;
    String attr1_type;
    Integer attr2_id;
    String attr2_type;
}

