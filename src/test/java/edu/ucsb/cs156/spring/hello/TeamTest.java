package edu.ucsb.cs156.spring.hello;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TeamTest {

    Team team;

    @BeforeEach
    public void setup() {
        team = new Team("test-team");  
    }

    @Test
    public void getName_returns_correct_name() {
       assert(team.getName().equals("test-team"));
    }

   
    // TODO: Add additional tests as needed to get to 100% jacoco line coverage, and
    // 100% mutation coverage (all mutants timed out or killed)

    @Test
    public void toString_returns_correct_string() {
        assertEquals("Team(name=test-team, members=[])", team.toString());
    }

    @Test
    public void same_object_returns_true() {
        assert(team.equals(team));
    }
    @Test
    public void different_type_returns() {
        int i = 1;
        assert(!team.equals(i));
    }
    @Test
    public void field_comparison_determines_equal (){
        Team obj = new Team("test-team");
        assert(team.equals(obj));
        obj.addMember("Hao");
        assert(!team.equals(obj));
        obj = new Team("test-team-different");
        assert(!team.equals(obj));
    }
    @Test
    public void hash_code_same_if_equals() {
        int correct_hash_code = -1226298695;
        assertEquals(correct_hash_code,team.hashCode());

        Team obj = new Team("test-team-different");
        assert(!(team.hashCode() == obj.hashCode()));
    }

}
