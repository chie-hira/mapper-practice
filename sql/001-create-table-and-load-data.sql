DROP TABLE IF EXISTS names;

CREATE TABLE names (
 id int unsigned AUTO_INCREMENT,
 name VARCHAR(20) NOT NULL,
 PRIMARY KEY(id)
);

INSERT INTO names (id, name) VALUES (1, "太宰治");
INSERT INTO names (id, name) VALUES (2, "芥川龍之介");

DROP TABLE IF EXISTS posts;

CREATE TABLE posts (
 id int unsigned AUTO_INCREMENT,
 title VARCHAR(20) NOT NULL,
 body VARCHAR(200) NOT NULL,
 PRIMARY KEY(id)
);

INSERT INTO posts (id, title, body) VALUES (1, "人間失格", "私は、その男の写真を三葉、見たことがある。一葉は、その男の、幼年時代、とでも言うべきであろうか、十歳前後かと推定される頃の写真であって、その子供が大勢の女のひとに取りかこまれ、（それは、その子供の姉たち、妹たち、それから、従姉妹いとこたちかと想像される）庭園の池のほとりに、荒い縞の袴はかまをはいて立ち、首を三十度ほど左に傾け、醜く笑っている写真である。");
INSERT INTO posts (id, title, body) VALUES (2, "羅生門", "ある日の暮方の事である。一人の下人げにんが、羅生門らしょうもんの下で雨やみを待っていた。広い門の下には、この男のほかに誰もいない。ただ、所々丹塗にぬりの剥はげた、大きな円柱まるばしらに、蟋蟀きりぎりすが一匹とまっている。");
