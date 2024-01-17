INSERT INTO recipemate.category (id, name)
VALUES (1, 'Kuchnia włoska');
INSERT INTO recipemate.category (id, name)
VALUES (2, 'Azjatyckie smaki');
INSERT INTO recipemate.category (id, name)
VALUES (3, 'Desery');

INSERT INTO recipemate.recipe (category_id, created_at, id, updated_at, description, difficulty, name, time_consuming,
                               portion_count)
VALUES (1, '2023-01-01 12:00:00.000000', 1, '2023-01-01 14:30:00.000000', '<p>Tradycyjne włoskie danie, które zawsze smakuje wyjątkowo. Pyszne spaghetti podane z sosem Bolognese, przygotowanym z mięsa mielonego, pomidorów, cebuli i przypraw.</p>
<p>To danie o średnim stopniu trudności sprawi, że poczujesz się jak w prawdziwej włoskiej trattorii.</p>',
        'Średni',
        'Spaghetti Bolognese', '45', 3),
       (2, '2023-01-02 10:30:00.000000', 2, '2023-01-02 12:45:00.000000', '<p>Dragon Roll Sushi to wyjątkowe danie kuchni azjatyckiej. Sushi zawinięte w kształt smoka z delikatnym nadzieniem rybnym, awokado i ogórkiem. Podane z sosem sojowo-imbirowym, to danie z pewnością oczaruje smakoszy kuchni orientalnej.</p>
<p>Przygotowanie tego dania jest trudniejsze, ale efekt z pewnością wynagrodzi wysiłek.</p>',
        'Trudny', 'Dragon Roll Sushi',
        '60', 2),
       (3, '2023-01-03 15:20:00.000000', 3, '2023-01-03 17:10:00.000000', '<p>Rogaliki maślane to pyszne i puszyste ciasteczka, które rozpływają się w ustach. Idealne na śniadanie lub podwieczorek. Przygotowanie ich jest łatwe i przyjemne, a efekt z pewnością zachwyci Twoje podniebienie.</p>
<p>Zapraszamy do spróbowania tego łatwego przepisu na słodki smakołyk!</p>',
        'Łatwy', 'Rogaliki maślane',
        '120', 5),
       (1, '2023-01-04 09:45:00.000000', 4, '2023-01-04 11:30:00.000000', '<p>Pizza Margherita to klasyczne danie włoskie, które zachwyca prostotą i smakiem. Delikatne ciasto, pomidory, mozzarella i świeża bazylia tworzą kompozycję idealną dla miłośników kuchni śródziemnomorskiej.</p>
<p>Przygotowanie tego dania o średnim stopniu trudności nie zajmie Ci wiele czasu, a efekt z pewnością będzie smakowity.</p>',
        'Średni',
        'Pizza Margherita', '30', 4),
       (2, '2023-01-05 14:15:00.000000', 5, '2023-01-05 16:00:00.000000', '<p>Kurczak Teryiaki z ryżem to danie inspirowane kuchnią japońską. Soczyste kawałki kurczaka w aromatycznym sosie Teryiaki, podane z ryżem - to połączenie smaków, które z pewnością przypadnie do gustu miłośnikom kuchni azjatyckiej.</p>
<p>Przygotowanie tego łatwego dania zajmie zaledwie 40 minut!</p>',
        'Łatwy',
        'Kurczak Teryiaki z ryżem', '40', 2),
       (3, '2023-01-06 11:00:00.000000', 6, '2023-01-06 13:20:00.000000', '<p>Mus czekoladowy to pyszny deser, który zadowoli wszystkich łasuchów. Delikatny mus z gorzkiej czekolady podany w eleganckich kieliszkach to doskonały sposób na zakończenie obiadu lub romantyczną kolację.</p>
<p>Choć przygotowanie musu jest trudniejsze, efekt z pewnością wynagrodzi wszelkie starania.</p>',
        'Łatwy',
        'Mus czekoladowy', '90', 6),
       (1, '2023-01-07 16:30:00.000000', 7, '2023-01-07 18:45:00.000000', '<p>Lasagna z wołowiną to klasyczne danie kuchni włoskiej, które uwodzi aromatem i smakiem. Warstwy makaronu, mięsa wołowego, sosu pomidorowego i sera tworzą niezapomnianą kompozycję.</p>
<p>Przygotowanie tego dania o średnim stopniu trudności z pewnością będzie przyjemnością dla miłośników kuchni włoskiej.</p>',
        'Średni', 'Lasagna z wołowiną',
        '75', 4),
       (2, '2023-01-08 12:45:00.000000', 8, '2023-01-08 14:15:00.000000', '<p>Łosoś w sojowo-imbirowym sosie to danie kuchni azjatyckiej, które wyróżnia się intensywnym smakiem i aromatem. Soczysty łosoś podany z delikatnym sosem sojowo-imbirowym to prawdziwa uczta dla podniebienia.</p>
<p>Przygotowanie tego łatwego dania zajmie zaledwie 35 minut!</p>',
        'Łatwy',
        'Łosoś w sojowo-imbirowym sosie', '35', 2),
       (3, '2023-01-09 10:00:00.000000', 9, '2023-01-09 11:45:00.000000', '<p>Sernik z malinami to pyszny deser, który zachwyci wszystkich miłośników serników. Delikatne ciasto serowe połączone z kwaśnymi malinami to doskonała propozycja na słodki poczęstunek.</p>
<p>Przygotowanie tego dania o średnim stopniu trudności zajmie około 60 minut.</p>',
        'Średni',
        'Sernik z malinami', '60', 3),
       (1, '2023-01-10 13:20:00.000000', 10, '2023-01-10 15:00:00.000000', '<p>Pizza wegetariańska to smaczna propozycja dla miłośników warzyw. Delikatne ciasto, sos pomidorowy, świeże warzywa i aromatyczne zioła tworzą idealną kombinację smakową.</p>
<p>Przygotowanie tej wegetariańskiej pizzy o łatwym stopniu trudności zajmie zaledwie 40 minut!</p>',
        'Łatwy',
        'Pizza wegetariańska', '40', 4),
       (2, '2023-01-11 08:30:00.000000', 11, '2023-01-11 10:15:00.000000', '<p>Mieszany zestaw tempury to danie kuchni japońskiej, które zachwyca delikatnością i chrupkością. Krewetki, kalamary, warzywa - wszystko obtoczone w cienkim cieście i smażone na złoto.</p>
<p>Przygotowanie tego dania o trudnym stopniu trudności zajmie około 75 minut, ale efekt z pewnością będzie wyjątkowy.</p>',
        'Trudny',
        'Mieszany zestaw tempury', '75', 5),
       (3, '2023-01-12 14:45:00.000000', 12, '2023-01-12 16:30:00.000000', '<p>Jabłecznik to tradycyjne ciasto, które zawsze cieszy się popularnością. Delikatne ciasto poddane magii jabłek, cynamonu i cukru tworzy pyszny deser idealny na każdą okazję.</p>
<p>Przygotowanie tego dania o średnim stopniu trudności zajmie około 50 minut.</p>',
        'Średni', 'Jabłecznik', '50',
        3);


-- INSERT INTO recipemate.user (id, first_name, email, password, second_name)
-- VALUES (1, 'JohnDoe', 'johndoe123@test.com', 'pass123', 'Doe');
-- INSERT INTO recipemate.user (id, first_name, email, password, second_name)
-- VALUES (2, 'JaneSmith', 'janesmith456@test.com', 'securepass', 'Smith');
-- INSERT INTO recipemate.user (id, first_name, email, password, second_name)
-- VALUES (3, 'MichaelJohnson', 'michaelj567@test.com', 'password123', 'Johnson');
-- INSERT INTO recipemate.user (id, first_name, email, password, second_name)
-- VALUES (4, 'EmilyWilliams', 'emilyw789@test.com', 'mysecretpassword', 'Williams');
-- INSERT INTO recipemate.user (id, first_name, email, password, second_name)
-- VALUES (5, 'DavidBrown', 'davidbrown0101@test.com', 'supersecurepass', 'Brown');

-- INSERT INTO recipemate.rate_recipe (value, recipe_id, user_id)
-- VALUES (4, 1, 1);
-- INSERT INTO recipemate.rate_recipe (value, recipe_id, user_id)
-- VALUES (5, 1, 2);
-- INSERT INTO recipemate.rate_recipe (value, recipe_id, user_id)
-- VALUES (3, 1, 3);
-- INSERT INTO recipemate.rate_recipe (value, recipe_id, user_id)
-- VALUES (4, 1, 4);
-- INSERT INTO recipemate.rate_recipe (value, recipe_id, user_id)
-- VALUES (5, 1, 5);
-- INSERT INTO recipemate.rate_recipe (value, recipe_id, user_id)
-- VALUES (3, 2, 1);
-- INSERT INTO recipemate.rate_recipe (value, recipe_id, user_id)
-- VALUES (4, 2, 2);
-- INSERT INTO recipemate.rate_recipe (value, recipe_id, user_id)
-- VALUES (5, 2, 3);
-- INSERT INTO recipemate.rate_recipe (value, recipe_id, user_id)
-- VALUES (3, 2, 4);
-- INSERT INTO recipemate.rate_recipe (value, recipe_id, user_id)
-- VALUES (4, 2, 5);

INSERT INTO recipemate.recipe_image (id, is_main, href, alt, title, recipe_id)
VALUES (1, true, 'https://images.unsplash.com/photo-1622973536968-3ead9e780960?q=80&w=2070&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D', 'danijela prijovic qits spaghetti', 'danijela prijovic qits spaghetti', 1),
       (2, false, 'https://images.unsplash.com/photo-1598866594230-a7c12756260f?q=80&w=2016&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D', 'emanuel ekstrom spaghetti', 'emanuel ekstrom spaghetti', 1),
       (3, false, 'https://images.unsplash.com/photo-1595295333158-4742f28fbd85?q=80&w=2080&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D', 'homescreenify spaghetti', 'homescreenify spaghetti', 1),
       (4, false, 'https://images.unsplash.com/photo-1607375658859-39f31567ce13?q=80&w=2070&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D', 'stefan schauberger spaghetti', 'stefan schauberger spaghetti', 1),

       (5, true, 'https://images.unsplash.com/photo-1617196034738-26c5f7c977ce?q=80&w=2070&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D', 'douglas-lopez sushi roll', 'douglas-lopez sushi roll', 2),
       (6, false, 'https://images.unsplash.com/photo-1617196034183-421b4917c92d?q=80&w=2088&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D', 'flyd loB9 sushi roll', 'flyd loB9 sushi roll', 2),
       (7, false, 'https://images.unsplash.com/photo-1607301406259-dfb186e15de8?q=80&w=2111&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D', 'jakub-dziubak sushi', 'jakub-dziubak sushi', 2),
       (8, false, 'https://images.unsplash.com/photo-1607301405418-780ee5e6dd10?q=80&w=1966&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D', 'thomas-marban-EHK sushi roll', 'thomas-marban-EHK sushi roll', 2),

       (9, true, 'https://images.unsplash.com/photo-1599940778173-e276d4acb2bb?q=80&w=2055&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D', 'conor brown croissant', 'conor brown croissant', 3),
       (10, false, 'https://plus.unsplash.com/premium_photo-1661288432140-96cfe29379fe?q=80&w=2070&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D', 'jocelyn-morales croissant', 'jocelyn-morales croissant', 3),
       (11, false, 'https://images.unsplash.com/photo-1623334044303-241021148842?q=80&w=2070&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D', 'mae-mu croissant', 'mae-mu croissant', 3),
       (12, false, 'https://images.unsplash.com/photo-1587912001191-0cd4f14fd89e?q=80&w=2070&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D', 'tom-paolini croissant', 'tom-paolini croissant', 3),

       (13, true, 'https://images.unsplash.com/photo-1604068549290-dea0e4a305ca?q=80&w=1974&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D', 'amirali-mirhashemian pizza margherita', 'amirali-mirhashemian pizza margherita', 4),
       (14, false, 'https://images.unsplash.com/photo-1571207133905-e63101f15248?q=80&w=2070&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D', 'aurelien-lemasson-theobald pizza margherita', 'aurelien-lemasson-theobald pizza margherita', 4),
       (15, false, 'https://images.unsplash.com/photo-1595854341625-f33ee10dbf94?q=80&w=2070&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D', 'louis-hansel pizza margherita', 'louis-hansel pizza margherita', 4),
       (16, false, 'https://images.unsplash.com/photo-1574071318508-1cdbab80d002?q=80&w=2069&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D', 'mahyar-mirghasemi pizza margherita', 'mahyar-mirghasemi pizza margherita', 4),

       (17, true, 'https://images.unsplash.com/photo-1636401870585-a8852371e84a?q=80&w=2070&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D', 'ca-creative teriyaki chicken', 'ca-creative teriyaki chicken', 5),
       (18, false, 'https://images.unsplash.com/photo-1564836235910-c3055ca0f912?q=80&w=2070&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D', 'fernando-aguilar teriyaki chicken', 'fernando-aguilar teriyaki chicken', 5),
       (19, false, 'https://images.unsplash.com/photo-1537543525161-3c93d0b61d7a?q=80&w=2070&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D', 'raman teriyaki chicken', 'raman teriyaki chicken', 5),
       (20, false, 'https://images.unsplash.com/photo-1519624014191-508652cbd7b5?q=80&w=1931&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D', 'ryan-kwok teriyaki chicken', 'ryan-kwok teriyaki chicken', 5),

       (21, true, 'https://images.unsplash.com/photo-1590080875852-ba44f83ff2db?q=80&w=2070&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D', 'American Heritage Chocolate', 'American Heritage Chocolate', 6),
       (22, false, 'https://images.unsplash.com/photo-1607662256021-751dc3939f2b?q=80&w=2074&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D', 'kisoulou chocolate mousse', 'kisoulou chocolate mousse', 6),
       (23, false, 'https://images.unsplash.com/photo-1588911550337-af627bab5d4f?q=80&w=2070&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D', 'Mathilda Khoo mousse', 'Mathilda Khoo mousse', 6),
       (24, false, 'https://images.unsplash.com/photo-1596914255028-18a986e2dee7?q=80&w=2070&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D', 'Teo Do Rio chocolate', 'Teo Do Rio chocolate', 6),

       (25, true, 'https://images.unsplash.com/photo-1636401870585-a8852371e84a?q=80&w=2070&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D', 'Feyza Yıldırım lasagna', 'Feyza Yıldırım lasagna', 7),
       (26, false, 'https://images.unsplash.com/photo-1621510456681-2330135e5871?q=80&w=2070&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D', 'Mateusz Feliksik lasagna', 'Mateusz Feliksik lasagna', 7),
       (27, false, 'https://images.unsplash.com/photo-1619895092538-128341789043?q=80&w=2070&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D', 'rabbit_in_blue lasagna', 'rabbit_in_blue lasagna', 7),
       (28, false, 'https://images.unsplash.com/photo-1546453570-d2fcacdafbb2?q=80&w=2052&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D', 'sheri silver lasagna', 'sheri silver lasagna', 7),

       (29, true, 'https://images.unsplash.com/photo-1519708227418-c8fd9a32b7a2?q=80&w=2070&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D', 'CA Creative salmon', 'CA Creative salmon', 8),
       (30, false, 'https://images.unsplash.com/photo-1499125562588-29fb8a56b5d5?q=80&w=1932&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D', 'CA Creative salmon raw', 'CA Creative salmon raw', 8),
       (31, false, 'https://images.unsplash.com/photo-1645120091968-5f24af8eaff5?q=80&w=2070&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D', 'Collab Media fried salmon', 'Collab Media fried salmon', 8),
       (32, false, 'https://images.unsplash.com/photo-1676300185165-3f543c1fcb72?q=80&w=2070&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D', 'Orkun Orcan salmon', 'Orkun Orcan salmon', 8),

       (33, true, 'https://images.unsplash.com/photo-1619985632461-f33748ef8f3e?q=80&w=1975&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D', 'dekode cheese cake', 'dekode cheese cake', 9),
       (34, false, 'https://images.unsplash.com/photo-1621955511667-e2c316e4575d?q=80&w=2070&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D', 'kalisha ocheni cheese cake', 'kalisha ocheni cheese cake', 9),
       (35, false, 'https://images.unsplash.com/photo-1576721512413-5529a27701ff?q=80&w=2076&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D', 'aimssimpson cheese cake', 'aimssimpson cheese cake', 9),
       (36, false, 'https://images.unsplash.com/photo-1611497438246-dcbb383de3c4?q=80&w=2069&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D', 'icsanti cheese cake', 'icsanti cheese cake', 9),

       (37, true, 'https://images.unsplash.com/photo-1551978129-b73f45d132eb?q=80&w=2017&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D', 'sheri silver vegan pizza', 'sheri silver vegan pizza', 10),
       (38, false, 'https://images.unsplash.com/photo-1490717064594-3bd2c4081693?q=80&w=2070&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D', 'brenen vegan pizza', 'brenen vegan pizza', 10),
       (39, false, 'https://images.unsplash.com/photo-1489564239502-7a532064e1c2?q=80&w=2070&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D', 'Cathal Mac an Bheatha oven', 'Cathal Mac an Bheatha oven', 10),
       (40, false, 'https://images.unsplash.com/photo-1621538997178-8acbbcd64506?q=80&w=2071&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D', 'kajetan vegan pizza', 'kajetan vegan pizza', 10),

       (41, true, 'https://images.unsplash.com/photo-1593357849627-cbbc9fda6b05?q=80&w=2070&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D', 'baby abbas tempura', 'baby abbas tempura', 11),
       (42, false, 'https://images.unsplash.com/photo-1593357871477-00fd350cc0f8?q=80&w=2070&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D', 'baby abbas tempura plates', 'baby abbas tempura plates', 11),
       (43, false, 'https://images.unsplash.com/photo-1593357897684-3464383fe8f3?q=80&w=2070&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D', 'baby abbas tempura plates 2', 'baby abbas tempura plates 2', 11),
       (44, false, 'https://plus.unsplash.com/premium_photo-1666920184707-fb5cad772301?q=80&w=2070&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D', 'jsb co. tempura', 'jsb co. tempura', 11),

       (45, true, 'https://images.unsplash.com/photo-1562007908-859b4ba9a1a2?q=80&w=2070&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D', 'dilja96 apple pie', 'dilja96 apple pie', 12),
       (46, false, 'https://images.unsplash.com/photo-1562007908-69cf18a6da04?q=80&w=2070&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D', 'dilja96 apple pie 2', 'dilja96 apple pie 2', 12),
       (47, false, 'https://images.unsplash.com/photo-1584541305671-af4f46b4be2f?q=80&w=1930&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D', 'ally p apple pie', 'ally p apple pie', 12),
       (48, false, 'https://images.unsplash.com/photo-1601000937490-4752ec5d905f?q=80&w=2070&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D', 'priscilla du preez apple pie christmas', 'priscilla du preez apple pie christmas', 12);

INSERT INTO recipemate.category_image (id, category_id, href, alt, title)
VALUES (1, 1, 'https://images.unsplash.com/photo-1498579150354-977475b7ea0b?q=80&w=2070&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D', 'Italian Cuisine', 'Italian Cuisine'),
       (2, 2, 'https://images.unsplash.com/photo-1622643944007-450264a5f9a9?q=80&w=2044&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D', 'Asian Flavors', 'Asian Flavors'),
       (3, 3, 'https://images.unsplash.com/photo-1486427944299-d1955d23e34d?q=80&w=2070&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D', 'Desserts', 'Desserts');

INSERT INTO ingredient (id, name)
VALUES (1, 'Pomidor'),
       (2, 'Makaron'),
       (3, 'Ziemniak'),
       (4, 'Cebula'),
       (5, 'Czosnek'),
       (6, 'Bazylia'),
       (7, 'Oliwa z oliwek'),
       (8, 'Mozzarella'),
       (9, 'Sól'),
       (10, 'Pieprz'),
       (11, 'Boczek'),
       (12, 'Marchewka'),
       (14, 'Łodyga selera naciowego'),
       (15, 'Wołowina'),
       (16, 'Czerwone Wino'),
       (17, 'Bulion'),
       (18, 'Koncentrat pomidorowy'),
       (19, 'Mleko'),
       (20, 'Parmezan'),
       (21, 'Obrane pomidory'),
       (22, 'Ogórek'),
       (23, 'Awokado'),
       (24, 'Nori'),
       (25, 'Ryż'),
       (26, 'Krewetki w tempurze'),
       (27, 'Tobiko'),
       (28, 'Węgorz'),
       (29, 'Ocet ryżowy'),
       (30, 'Woda'),
       (31, 'Sezam'),
       (32, 'Drożdże'),
       (33, 'Masło'),
       (34, 'Mąka pszenna'),
       (35, 'Cukier'),
       (36, 'Żółtko'),
       (37, 'Oregano'),
       (38, 'Mozaarella (kulki)'),
       (39, 'Filet z kurczaka'),
       (40, 'Olej roślinny'),
       (41, 'Sos sojowy'),
       (42, 'Syrop klonowy'),
       (43, 'Starty imbir'),
       (44, 'Brązowy ryż'),
       (45, 'Czerwona papryka'),
       (46, 'Zielony groszek'),
       (47, 'Olej sezamowy'),
       (48, 'Śmietanka 30%'),
       (49, 'Mascarpone'),
       (50, 'Gorzka czekolada'),
       (51, 'Jajko'),
       (52, 'Passata pomidorowa'),
       (53, 'Tymianek'),
       (54, 'Filet łososia'),
       (55, 'Sok z limonki'),
       (56, 'Miód'),
       (57, 'Szczypior'),
       (58, 'Kolędra'),
       (59, 'Proszek do pieczenia'),
       (60, 'Maliny'),
       (61, 'Jabłko');




INSERT INTO measure (id, name)
VALUES (1, 'szklanki'),
       (2, 'gramy'),
       (3, 'sztuki'),
       (4, 'średni'),
       (5, 'ząbki'),
       (6, 'łyżka stołowa'),
       (7, 'łyżeczka'),
       (8, 'puszka'),
       (9, 'filet'),
       (10, 'ml'),
       (11, 'szczypta'),
       (12, 'liść'),
       (13, 'pęczek')

INSERT INTO recipe_ingredient (count, ingredient_id, recipe_id, measure_id)
VALUES (150, 11, 1, 2),
       (1, 4, 1, 3),
       (2, 14, 1, 3),
       (1, 12, 1, 3),
       (2, 7, 1, 6),
       (250, 15, 1, 2),
       (1, 16, 1, 1),
       (1, 17, 1, 1),
       (4, 18, 1, 6),
       (1, 21, 1, 8),
       (0.5, 19, 1, 1),
       (150, 2, 1, 2),
       (15, 20, 1, 2);

INSERT INTO recipe_ingredient (count, ingredient_id, recipe_id, measure_id)
VALUES (1, 22, 2, 3),
       (2, 23, 2, 3),
       (2, 24, 2, 3),
       (360, 25, 2, 2),
       (8, 26, 2, 3),
       (20, 27, 2, 2),
       (1, 28, 2, 9),
       (2, 29, 2, 7),
       (60, 30, 2, 10),
       (5, 31, 2, 2);

INSERT INTO recipe_ingredient (count, ingredient_id, recipe_id, measure_id)
VALUES (220, 19, 3, 10),
       (20, 32, 3, 2),
       (0.5, 9, 3, 7),
       (40, 33, 3, 2),
       (375, 34, 3, 2),
       (3, 35, 3, 6),
       (1, 36, 3, 3);

INSERT INTO recipe_ingredient (count, ingredient_id, recipe_id, measure_id)
VALUES (25, 32, 4, 2),
       (150, 30, 4, 10),
       (0.5, 35, 4, 7),
       (250, 34, 4, 2),
       (1, 9, 4, 7),
       (1, 7, 4, 6),
       (1, 10, 4, 11),
       (0.5, 37, 4, 7),
       (2, 38, 4, 3),
       (6, 6, 4, 11);

INSERT INTO recipe_ingredient (count, ingredient_id, recipe_id, measure_id)
VALUES (450, 39, 5, 2),
       (1, 40, 5, 6),
       (5, 41, 5, 6),
       (2, 29, 5, 6),
       (2, 42, 5, 6),
       (2, 5, 5, 5),
       (2, 43, 5, 7),
       (100, 44, 5, 2),
       (0.5, 45, 5, 3),
       (1, 7, 5, 7),
       (0.5, 46, 5, 1),
       (1, 47, 5, 7),
       (2, 31, 5, 6),


INSERT INTO recipe_ingredient (count, ingredient_id, recipe_id, measure_id)
VALUES (1, 48, 6, 1),
       (250, 49, 6, 2),
       (200, 50, 6, 2),
       (2, 35, 6, 6);

INSERT INTO recipe_ingredient (count, ingredient_id, recipe_id, measure_id)
VALUES (400, 34, 7, 2),
       (4, 51, 7, 3),
       (1, 9, 7, 11),
       (400, 15, 7, 2),
       (50, 20, 7, 2),
       (200, 52, 7, 10),
       (50, 16, 7, 10),
       (1, 4, 7, 3),
       (1, 18, 7, 6),
       (1, 37, 7, 7),
       (1, 53, 7, 7),
       (2, 5, 7, 5),

INSERT INTO recipe_ingredient (count, ingredient_id, recipe_id, measure_id)
VALUES (500, 54, 8, 2),
       (30, 55, 8, 10),
       (4, 41, 8, 6),
       (2, 56, 8, 6),
       (4, 40, 8, 6),
       (1, 57, 8, 13),
       ( 1, 10, 8, 11),
       (10, 43, 8, 2),
       (1, 58, 8, 2);

INSERT INTO recipe_ingredient (count, ingredient_id, recipe_id, measure_id)
VALUES (225, 34, 9, 2),
       (5, 35, 9, 6),
       (1, 59, 9, 7),
       (150, 33, 9, 2),
       (1, 51, 9, 3),
       (400, 60, 9, 2);

INSERT INTO recipe_ingredient (count, ingredient_id, recipe_id, measure_id)
VALUES (1500, 61, 12, 2),
       (320, 34, 12, 2),
       (200, 33, 12, 2),
       (1, 51, 12, 3),
       (0.25, 35, 12, 1),
       (2, 59, 12, 7);


-- Insert records into the recipe_step table
INSERT INTO recipe_step (step_order, title, description, recipe_id)
VALUES (1, 'Step 1', 'Description for step 1 for Product 1', 1),
       (2, 'Step 2', 'Description for step 2 for Product 1', 1),
       (3, 'Step 3', 'Description for step 3 for Product 1', 1),

       (1, 'Step 1', 'Description for step 1 for Product 2', 2),
       (2, 'Step 2', 'Description for step 2 for Product 2', 2),
       (3, 'Step 3', 'Description for step 3 for Product 2', 2),

       (1, 'Step 1', 'Description for step 1 for Product 3', 3),
       (2, 'Step 2', 'Description for step 2 for Product 3', 3),
       (3, 'Step 3', 'Description for step 3 for Product 3', 3),

       (1, 'Step 1', 'Description for step 1 for Product 4', 4),
       (2, 'Step 2', 'Description for step 2 for Product 4', 4),
       (3, 'Step 3', 'Description for step 3 for Product 4', 4),

       (1, 'Step 1', 'Description for step 1 for Product 5', 5),
       (2, 'Step 2', 'Description for step 2 for Product 5', 5),
       (3, 'Step 3', 'Description for step 3 for Product 5', 5);