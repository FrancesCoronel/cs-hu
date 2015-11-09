/**
  StudentID     int             NOT NULL,
  Title         varchar(5)      NOT NULL DEFAULT 'M.',
  FirstName     varchar(50)     NOT NULL,
  MiddleName    varchar(50)     NOT NULL,
  LastName      varchar(50)     NOT NULL,
  Address       varchar(50)     NULL,
  Zip           char(5)         NOT NULL,
  PhoneNumber   varchar(15)     NULL,
  Major         varchar(50)     NULL,
 */

INSERT INTO Student
    (StudentID,   Title,    FirstName,  MiddleName, LastName,  Address,                     Zip,      PhoneNumber,    Major)
VALUES
    (00319124,    'Miss.',  'Violet',   'F',    'Siegius',     '7304 Blueberry Lane',       '23506',  '7573457839',   'Computer Science'),
    (50150740,    'Mr.',    'Huey',     'P',    'Freeman',     '1204 Gold Road',            '33510',  '8456949022',   'Political Science'),
    (02345434,    'Mr.',    'Riley',    'J',    'Freeman',     '1204 Gold Road',            '33510',  '8456459012',   'Agriculture'),
    (83521976,    'Mr.',    'Jeffrey',  'M',    'Dowden',      '625  Hinkle Lake Road',     '43015',  '6174558857',   'PreMed'),
    (76045040,    'Mr.',    'Scott',    'R',    'Yates',       '3292 Elliott Street',       '03449',  '6035251968',   'Biology'),
    (04625529,    'Mr.',    'David',    'S',    'Yates',       '3481 Raintree Boulevard',   '55402',  '7639768610',   'Finance'),
    (49746228,    'Mrs.',   'Margaret', 'T',    'Santangelo',  '1234 Hoffman Avenue',       '10007',  '9179412870',   'Mathematics'),
    (87130888,    'Mrs.',   'Eva',      'L',    'Callahan',    '1341 Howard Street',        '01545',  '6164566498',   'Psychology'),
    (07829928,    'Mrs.',   'Maria',    'L',    'Totten',      '1001 Elk Creed Road',       '30501',  '7705354144',   'Philosophy'),
    (80317576,    'Mrs.',   'Wendy',    'J',    'Leone',       '2603 Patterson Fork Road',  '53154',  '3126183137',   'Law')

/**
  Zip           char(5)         NOT NULL,
  City          char(20)        NOT NULL,
  State         char(2)         NOT NULL,
 */

INSERT INTO ZipCode
    (ZipCode,     City,           State)
VALUES
    ('23506',     'Norfolk',      'VA'),
    ('33510',     'Brandon',      'FL'),
    ('53154',     'Oak Creek',    'WI'),
    ('44052',     'Lorain',       'OH'),
    ('01545',     'Shrewsbury',   'MA'),
    ('33125',     'Miami',        'FL'),
    ('28655',     'Morganton',    'NC'),
    ('30680',     'Winder',       'GA'),
    ('48185',     'Westland',     'MI'),
    ('43015',     'Delaware',     'OH'),
    ('30223',     'Griffin',      'GA');

/**
  Term          Number(6)       NOT NULL,
  CRN           varchar(10)     NOT NULL,
  Code          int(10)         NULL,
  Number        int(10)         NULL,
  Section       int(5)          NULL,
  Level         char(1)         NULL,
  Hours         int             NULL,
  Days          char(6)         NULL,
  Room          char(5)         NULL,
  Time          time            NULL,
 */

INSERT INTO Course
    (Term,      CRN,      Code,   Num,  Section,   LVL, Hrs,    Days,   Room,     Time)
VALUES
    (201510,    23769,    ARC,    102,  01,        U,   5.000   MWF,    BE 106,   09:00 am-11:50 am),
    (201510,    24666,    ART,    200,  01,        U,   3.000   MWF     AS 205,   10:00 am-10:50 am),
    (201510,    25590,    AVN,    162,  01,        U,   3.000   MWF,    ST 254,   11:00 am-11:50 am)
    (201510,    24389,    BIO,    105,  02,        U,   4.000   TR,     TU 129,   12:30 pm-01:45 pm)
    (201510,    25406,    CHE,    202,  05,        U,   4.000   TR,     AR 115,   09:30 am-10:45 am),
    (201510,    24500,    CDS,    606,  01,        U,   3.000   W,      ST 214,   06:00 pm-08:45 pm),
    (201510,    24340,    COM,    103,  23,        U,   3.000   TR,     AR 236,   02:00 pm-03:15 pm),
    (201510,    25467,    CSC,    152,  01,        U,   3.000   TR,     ST 126,   02:00 pm-03:15 pm),
    (201510,    24825,    ECO,    200,  01,        U,   3.000   TR,     BU 122,   05:00 pm-06:15 pm),
    (201510,    24685,    ENG,    207,  01,        U,   3.000   MW,     AR 236,   02:00 pm-03:15 pm);

/**
  StudentID     int(10)         NOT NULL,
  Term          int(6)          NOT NULL,
  CRN           int(5)          NOT NULL,
  Date          date            NOT NULL,
  GradeType     varchar(10)     NOT NULL,
  Status        varchar(2)      NOT NULL,
  PreReg        bool            NOT NULL,
  TotalCredits  int             NOT NULL,
 */

INSERT INTO Form
    (StudentID,   Term,    CRN,    Date,       GradeType,  Status, PreReg, TotalCredits)
VALUES
    (00319124,  201510,  23769,  2015-10-27,   U,          Pass,   true,   5.0),
    (50150740,  201510,  24666,  2015-10-27,   U,          Pass,   true,   4.0),
    (02345434,  201510,  25590,  2015-10-27,   U,          Pass,   true,   3.0),
    (83521976,  201510,  24389,  2015-10-27,   U,          Pass,   true,   2.0),
    (76045040,  201510,  25406,  2015-10-27,   U,          Pass,   true,   1.0),
    (04625529,  201510,  24500,  2015-10-27,   U,          Pass,   true,   5.0),
    (49746228,  201510,  24340,  2015-10-27,   U,          Pass,   true,   4.0),
    (87130888,  201510,  25467,  2015-10-27,   U,          Pass,   true,   3.0),
    (07829928,  201510,  24825,  2015-10-27,   U,          Pass,   true,   2.0),
    (80317576,  201510,  24685,  2015-10-27,   U,          Pass,   true,   1.0);