package com.example.delegatelog.model;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.time.LocalDateTime;
import java.time.LocalDate;
import java.time.Period;

@Entity
@Table(name = "clients")

public class Client {
   private LocalDateTime submission;
   @Id
   @GeneratedValue
   private long id;
   private String crisisworker;
   private String fname;
   private String lname;
   private int age;
   private String sex;
   private String jurisdiction;
   private String facility;
   private String notes;
   private String ideation;
   private String actionable;
   private boolean determination;

   public Client() {
   }

   public Client(LocalDateTime submission, long id, String crisisworker, String fname, String lname, int age, String sex,
                 String jurisdiction, String facility,
                 String ideation, String actionable, boolean determination){

      this.submission = submission;
      this.id = id;
      this.crisisworker = crisisworker;
      this.fname = fname;
      this.lname = lname;
      this.age = age;
      this.sex = sex;
      this.jurisdiction = jurisdiction;
      this.facility = facility;
      this.ideation = ideation;
      this.actionable = actionable;
      this.determination = determination;
   }

   public LocalDateTime getSubmission() {
      return submission;
   }

   public void setSubmission(LocalDateTime submission) {
      this.submission = submission;
   }

   public long getId() {
      return id;
   }

   public void setId(long id) {
      this.id = id;
   }

   public String getCrisisworker() {
      return crisisworker;
   }

   public void setCrisisworker(String crisisworker) {
      this.crisisworker = crisisworker;
   }

   public String getFname() {
      return fname;
   }

   public void setFname(String fname) {
      this.fname = fname;
   }

   public String getLname() {
      return lname;
   }

   public void setLname(String lname) {
      this.lname = lname;
   }

   public int getAge() {
      return age;
   }

   public void setAge(int age) {
      this.age = age;
   }

   public String getSex() {
      return sex;
   }

   public void setSex(String sex) {
      this.sex = sex;
   }

   public String getJurisdiction() {
      return jurisdiction;
   }

   public void setJurisdiction(String jurisdiction) {
      this.jurisdiction = jurisdiction;
   }

   public String getFacility() {
      return facility;
   }

   public void setFacility(String facility) {
      this.facility = facility;
   }

   public String getNotes() {
      return notes;
   }

   public void setNotes(String notes) {
      this.notes = notes;
   }

   public String getIdeation() {
      return ideation;
   }

   public void setIdeation(String ideation) {
      this.ideation = ideation;
   }

   public String getActionable() {
      return actionable;
   }

   public void setActionable(String actionable) {
      this.actionable = actionable;
   }

   public boolean isDetermination() {
      return determination;
   }

   public void setDetermination(boolean determination) {
      this.determination = determination;
   }
}