package kr.ac.jejunu.portalfinal.domain;


import lombok.Data;

import java.sql.Date;

@Data
public class BoardVO {

    private int bno;
    private String subject;
    private String content;
    private String writer;
    private Date reg_date;
    private int hit;

}
