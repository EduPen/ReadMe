package com.library.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchBox_StepDefs {

    @Then("categories list should have following names:")
    public void categories_list_should_have_following_names(io.cucumber.datatable.DataTable dataTable) {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
        // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
        // Double, Byte, Short, Long, BigInteger or BigDecimal.
        //
        // For other transformations you can register a DataTableType.

    }

    @When("search by {string}")
    public void search_by(String string) {

    }

    @Then("verify the search with following column information")
    public void verify_the_search_with_following_column_information() {

    }






}
