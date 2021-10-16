$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/FakeGoldBar.feature");
formatter.feature({
  "line": 2,
  "name": "Balance Scale Program",
  "description": "",
  "id": "balance-scale-program",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@regression"
    }
  ]
});
formatter.background({
  "line": 4,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "User is on Fetch Rewards Game page",
  "keyword": "Given "
});
formatter.match({
  "location": "FakeGoldBar.user_is_on_Fetch_Rewards_Game_page()"
});
formatter.result({
  "duration": 7725971208,
  "status": "passed"
});
formatter.scenario({
  "line": 7,
  "name": "As a user, I want to be able to find the correct fake gold bar",
  "description": "",
  "id": "balance-scale-program;as-a-user,-i-want-to-be-able-to-find-the-correct-fake-gold-bar",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 8,
  "name": "user inserts the following numbers in the left bowl",
  "rows": [
    {
      "cells": [
        "left0",
        "left1",
        "left2",
        "left3"
      ],
      "line": 9
    },
    {
      "cells": [
        "0",
        "1",
        "2",
        "3"
      ],
      "line": 10
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "user inserts the following numbers in the right bowl",
  "rows": [
    {
      "cells": [
        "right0",
        "right1",
        "right2",
        "right3"
      ],
      "line": 12
    },
    {
      "cells": [
        "4",
        "5",
        "6",
        "7"
      ],
      "line": 13
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "user clicks on \"Weigh\" button",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "user verifies the weighing list",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "user clicks on \"Reset\" button",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "user inserts 2 numbers in the left bowl",
  "keyword": "Then "
});
formatter.step({
  "line": 18,
  "name": "user inserts 2 numbers in the right bowl",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "user clicks on \"Weigh\" button",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "user verifies the weighing list second time",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "user clicks on \"Reset\" button",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "user inserts 1 number in the left bowl",
  "keyword": "Then "
});
formatter.step({
  "line": 23,
  "name": "user inserts 1 number in the right bowl",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "user clicks on \"Weigh\" button",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "user verifies the weighing list third time",
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "user clicks on fake gold bar and verifies pop-up message \"Yay! You find it!\"",
  "keyword": "Then "
});
formatter.step({
  "line": 27,
  "name": "user gets list of Weighings and outputs it",
  "keyword": "And "
});
formatter.match({
  "location": "FakeGoldBar.user_inserts_the_following_numbers_in_the_left_bowl(LeftBowlDataContainer\u003e)"
});
formatter.result({
  "duration": 524607042,
  "status": "passed"
});
formatter.match({
  "location": "FakeGoldBar.user_inserts_the_following_numbers_in_the_right_bowl(RightBowlDataContainer\u003e)"
});
formatter.result({
  "duration": 202242916,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Weigh",
      "offset": 16
    }
  ],
  "location": "FakeGoldBar.user_clicks_on_button(Button)"
});
formatter.result({
  "duration": 2250399292,
  "status": "passed"
});
formatter.match({
  "location": "FakeGoldBar.user_verifies_the_weighing_list()"
});
formatter.result({
  "duration": 53291375,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Reset",
      "offset": 16
    }
  ],
  "location": "FakeGoldBar.user_clicks_on_button(Button)"
});
formatter.result({
  "duration": 2098938708,
  "status": "passed"
});
formatter.match({
  "location": "FakeGoldBar.user_inserts_2_numbers_in_the_left_bowl()"
});
formatter.result({
  "duration": 3080478667,
  "status": "passed"
});
formatter.match({
  "location": "FakeGoldBar.user_inserts_2_numbers_in_the_right_bowl()"
});
formatter.result({
  "duration": 3105782958,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Weigh",
      "offset": 16
    }
  ],
  "location": "FakeGoldBar.user_clicks_on_button(Button)"
});
formatter.result({
  "duration": 2036772250,
  "status": "passed"
});
formatter.match({
  "location": "FakeGoldBar.user_verifies_the_weighing_list_second_time()"
});
formatter.result({
  "duration": 21688791,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Reset",
      "offset": 16
    }
  ],
  "location": "FakeGoldBar.user_clicks_on_button(Button)"
});
formatter.result({
  "duration": 2032817125,
  "status": "passed"
});
formatter.match({
  "location": "FakeGoldBar.user_inserts_1_number_in_the_left_bowl()"
});
formatter.result({
  "duration": 2060642000,
  "status": "passed"
});
formatter.match({
  "location": "FakeGoldBar.user_inserts_1_number_in_the_right_bowl()"
});
formatter.result({
  "duration": 2056644583,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Weigh",
      "offset": 16
    }
  ],
  "location": "FakeGoldBar.user_clicks_on_button(Button)"
});
formatter.result({
  "duration": 2030299666,
  "status": "passed"
});
formatter.match({
  "location": "FakeGoldBar.user_verifies_the_weighing_list_third_time()"
});
formatter.result({
  "duration": 20560833,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Yay! You find it!",
      "offset": 58
    }
  ],
  "location": "FakeGoldBar.user_clicks_on_fake_gold_bar_and_verifies_pop_up_message(String)"
});
formatter.result({
  "duration": 1364089792,
  "status": "passed"
});
formatter.match({
  "location": "FakeGoldBar.user_gets_list_of_Weighings_and_outputs_it()"
});
formatter.result({
  "duration": 51584417,
  "status": "passed"
});
formatter.background({
  "line": 4,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "User is on Fetch Rewards Game page",
  "keyword": "Given "
});
formatter.match({
  "location": "FakeGoldBar.user_is_on_Fetch_Rewards_Game_page()"
});
formatter.result({
  "duration": 296012458,
  "status": "passed"
});
formatter.scenario({
  "line": 30,
  "name": "As a user, I want to be able to get error message when choosing wrong fake gold bar",
  "description": "",
  "id": "balance-scale-program;as-a-user,-i-want-to-be-able-to-get-error-message-when-choosing-wrong-fake-gold-bar",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 31,
  "name": "user clicks on random fake gold bar and verifies error pop-up message \"Oops! Try Again!\"",
  "keyword": "When "
});
formatter.step({
  "line": 32,
  "name": "user gets list of Weighings and outputs it",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "Oops! Try Again!",
      "offset": 71
    }
  ],
  "location": "FakeGoldBar.user_clicks_on_random_fake_gold_bar_and_verifies_error_pop_up_message(String)"
});
formatter.result({
  "duration": 2083791250,
  "status": "passed"
});
formatter.match({
  "location": "FakeGoldBar.user_gets_list_of_Weighings_and_outputs_it()"
});
formatter.result({
  "duration": 40088812291,
  "status": "passed"
});
});