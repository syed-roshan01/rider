.class public final Lf5/z;
.super Lw8/i;

# interfaces
.implements Lc9/e;


# static fields
.field private static final short:[S


# instance fields
.field public a:Ljava/lang/Object;

.field public b:Lcom/auto/accept/ui/viewmodel/MainViewModel;

.field public c:Ljava/lang/String;

.field public d:Lcom/google/firebase/auth/FirebaseUser;

.field public e:I

.field public final f:Lcom/auto/accept/ui/viewmodel/MainViewModel;

.field public final n:Ljava/lang/String;

.field public final o:Ljava/lang/String;

.field public final p:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x99

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Lf5/z;->short:[S

    return-void

    :array_0
    .array-data 2
        0x4eds
        0x4efs
        0x4fes
        0x4dfs
        0x4e3s
        0x4ees
        0x4a2s
        0x4a4s
        0x4a4s
        0x4a4s
        0x4a3s
        0x398s
        0x3a2s
        0x3acs
        0x3a5s
        0x3bes
        0x3bbs
        0x3ebs
        0x3ads
        0x3aas
        0x3a2s
        0x3a7s
        0x3aes
        0x3afs
        0x65as
        0x658s
        0x655s
        0x655s
        0x619s
        0x64ds
        0x656s
        0x619s
        0x61es
        0x64bs
        0x65cs
        0x64as
        0x64cs
        0x654s
        0x65cs
        0x61es
        0x619s
        0x65bs
        0x65cs
        0x65fs
        0x656s
        0x64bs
        0x65cs
        0x619s
        0x61es
        0x650s
        0x657s
        0x64fs
        0x656s
        0x652s
        0x65cs
        0x61es
        0x619s
        0x64es
        0x650s
        0x64ds
        0x651s
        0x619s
        0x65as
        0x656s
        0x64bs
        0x656s
        0x64cs
        0x64ds
        0x650s
        0x657s
        0x65cs
        0x66ds
        0x64cs
        0x603s
        0x64as
        0x64ds
        0x657s
        0x646s
        0x651s
        0x64ds
        0x646s
        0x657s
        0x603s
        0x640s
        0x64cs
        0x64ds
        0x64ds
        0x646s
        0x640s
        0x657s
        0x64as
        0x64cs
        0x64ds
        0x60ds
        0x603s
        0x673s
        0x64fs
        0x646s
        0x642s
        0x650s
        0x646s
        0x603s
        0x640s
        0x64bs
        0x646s
        0x640s
        0x648s
        0x603s
        0x65as
        0x64cs
        0x656s
        0x651s
        0x603s
        0x64ds
        0x646s
        0x657s
        0x654s
        0x64cs
        0x651s
        0x648s
        0x60ds
        0x2f8s
        0x2d9s
        0x296s
        0x2dfs
        0x2d8s
        0x2c2s
        0x2d3s
        0x2c4s
        0x2d8s
        0x2d3s
        0x2c2s
        0x296s
        0x2d5s
        0x2d9s
        0x2d8s
        0x2d8s
        0x2d3s
        0x2d5s
        0x2c2s
        0x2dfs
        0x2d9s
        0x2d8s
        0x74es
        0x741s
        0x74bs
        0x75ds
        0x740s
        0x746s
        0x74bs
        0x770s
        0x746s
        0x74bs
    .end array-data
.end method

.method public constructor <init>(Lcom/auto/accept/ui/viewmodel/MainViewModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lu8/e;)V
    .locals 2

    iput-object p1, p0, Lf5/z;->f:Lcom/auto/accept/ui/viewmodel/MainViewModel;

    iput-object p2, p0, Lf5/z;->n:Ljava/lang/String;

    iput-object p3, p0, Lf5/z;->o:Ljava/lang/String;

    iput-object p4, p0, Lf5/z;->p:Ljava/lang/String;

    sget v0, Lw5/ۣۨۧ۠;->۟۠ۢ۠۟:I

    xor-int/lit16 v0, v0, 0x121

    invoke-direct {p0, v0, p5}, Lw8/i;-><init>(ILu8/e;)V

    invoke-static {}, Lq1/۠۠ۤ;->ۧۢۦۣ()I

    move-result v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-ltz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    const-string v0, "aQWLSNMnsAkWEsdlFVt7WrSxXMfW"

    invoke-static {v0}, Lj5/۟ۢۥۨۦ;->۟ۤۢۢۦ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v0

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(F)V

    :sswitch_3
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_3
    .end sparse-switch
.end method

.method public static ۣۣۡۡ()[S
    .locals 2

    invoke-static {}, Lm3/۟ۦۦۡۢ;->۟ۢ۟ۦۦ()I

    move-result v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-gtz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    sget-object v0, Lf5/z;->short:[S

    :sswitch_3
    return-object v0

    :sswitch_4
    const/4 v0, 0x0

    const/16 v1, 0x6cc

    :goto_1
    xor-int/lit16 v1, v1, 0x6dd

    sparse-switch v1, :sswitch_data_1

    goto :goto_1

    :sswitch_5
    const/16 v1, 0x6eb

    goto :goto_1

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_4
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_5
        0x36 -> :sswitch_3
    .end sparse-switch
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lu8/e;)Lu8/e;
    .locals 6

    const/4 v0, 0x0

    const-string v5, "\u06e6\u06e5\u06e2"

    move-object v3, v0

    move-object v1, v0

    move-object v2, v0

    move-object v4, v0

    :goto_0
    invoke-static {v5}, Lcom/google/firebase/annotations/concurrent/ۣ۟ۧۥۨ;->۟۟۟۠ۦ(Ljava/lang/Object;)I

    move-result v0

    sparse-switch v0, :sswitch_data_0

    invoke-static {p0}, Lcom/google/android/gms/common/ۦۢۨ;->ۥۧ۟ۥ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    const-string v0, "\u06e3\u06df\u06df"

    move-object v5, v0

    goto :goto_0

    :sswitch_0
    invoke-static {p0}, Lb/۠ۨۦۥ;->ۡۦۡۨ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    const-string v0, "\u06e5\u06df\u06e4"

    move-object v5, v0

    goto :goto_0

    :sswitch_1
    new-instance v0, Lf5/z;

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Lf5/z;-><init>(Lcom/auto/accept/ui/viewmodel/MainViewModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lu8/e;)V

    const-string v5, "\u06e0\u06e8\u06e8"

    move-object p0, v0

    goto :goto_0

    :sswitch_2
    invoke-static {p0}, Ls7/۟ۢ۟ۤۧ;->ۣۢۧۢ(Ljava/lang/Object;)Lcom/auto/accept/ui/viewmodel/MainViewModel;

    move-result-object v1

    const-string v0, "\u06e7\u06e2\u06e3"

    move-object v5, v0

    goto :goto_0

    :sswitch_3
    invoke-static {p0}, Lc3/۟ۡۧۢۥ;->ۣۣۡۨ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    const-string v0, "\u06e3\u06e8\u06e2"

    move-object v5, v0

    goto :goto_0

    :sswitch_4
    return-object p0

    nop

    :sswitch_data_0
    .sparse-switch
        0x1aabe0 -> :sswitch_4
        0x1ab603 -> :sswitch_3
        0x1ab71d -> :sswitch_1
        0x1ac203 -> :sswitch_2
        0x1ac568 -> :sswitch_0
    .end sparse-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    const/4 v0, 0x0

    const-string v6, "\u06e0\u06e0\u06e6"

    move-object v1, v0

    move-object v3, v0

    move-object v4, v0

    move-object v2, p1

    move-object v5, v0

    :goto_0
    invoke-static {v6}, Lcom/google/firebase/annotations/concurrent/ۣ۟ۧۥۨ;->۟۟۟۠ۦ(Ljava/lang/Object;)I

    move-result v0

    sparse-switch v0, :sswitch_data_0

    move-object v0, v1

    check-cast v0, Lf5/z;

    const-string v6, "\u06e1\u06df\u06df"

    move-object p0, v0

    goto :goto_0

    :sswitch_0
    invoke-static {p0, v5, v3}, Lja/ۥۣۨ۠;->ۤۥۦۣ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lu8/e;

    move-result-object v1

    const-string v0, "\u06e0\u06e5\u06df"

    move-object v6, v0

    goto :goto_0

    :sswitch_1
    invoke-static {p0, v4}, Lx5/ۡۦۦۥ;->۟ۤۨۨۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    const-string v0, "\u06e7\u06e1\u06e4"

    move-object v6, v0

    goto :goto_0

    :sswitch_2
    invoke-static {}, Laa/۟ۦۣۢۨ;->ۣۧ۟ۡ()Lq8/l;

    move-result-object v0

    const-string v6, "\u06e3\u06e2\u06df"

    move-object v4, v0

    goto :goto_0

    :sswitch_3
    move-object v0, v2

    check-cast v0, Lm9/d0;

    const-string v6, "\u06e8\u06e4\u06e1"

    move-object v5, v0

    goto :goto_0

    :sswitch_4
    move-object v0, p2

    check-cast v0, Lu8/e;

    const-string v6, "\u06e0\u06e4\u06e6"

    move-object v3, v0

    goto :goto_0

    :sswitch_5
    return-object v2

    nop

    :sswitch_data_0
    .sparse-switch
        0x1aaae6 -> :sswitch_3
        0x1aab62 -> :sswitch_0
        0x1aae81 -> :sswitch_2
        0x1ab660 -> :sswitch_1
        0x1ac54a -> :sswitch_5
        0x1ac965 -> :sswitch_4
    .end sparse-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 18

    invoke-static {}, Lh0/۟ۥ۟ۡۦ;->ۣۧۡۢ()Lv8/a;

    move-result-object v11

    invoke-static/range {p0 .. p0}, Lx7/۟۟ۦۨۡ;->ۢۡۦۣ(Ljava/lang/Object;)I

    move-result v3

    invoke-static {}, Laa/۟ۦۣۢۨ;->ۣۧ۟ۡ()Lq8/l;

    move-result-object v12

    invoke-static {}, Lf5/z;->ۣۣۡۡ()[S

    move-result-object v2

    const/4 v4, 0x0

    sget v5, Lcom/google/firebase/installations/ktx/ۡۥۦ۟;->۟ۢۢ۟ۥ:I

    xor-int/lit16 v5, v5, 0x239

    const/16 v6, 0x48a

    invoke-static {v2, v4, v5, v6}, Lg/۟۠ۡۨۨ;->ۨ۟۠ۤ([SIII)Ljava/lang/String;

    move-result-object v14

    invoke-static {}, Lf5/z;->ۣۣۡۡ()[S

    move-result-object v2

    const/16 v4, 0xb

    sget v5, Lcom/google/firebase/remoteconfig/interop/ۣۨۡ۟;->ۣۥۨۦ:I

    xor-int/lit8 v5, v5, 0x6e

    const/16 v6, 0x3cb

    invoke-static {v2, v4, v5, v6}, Lcom/google/firebase/analytics/ktx/ktxtesting/۟ۦۣۧۧ;->ۡۤۢ۠([SIII)Ljava/lang/String;

    move-result-object v10

    invoke-static/range {p0 .. p0}, Ls7/۟ۢ۟ۤۧ;->ۣۢۧۢ(Ljava/lang/Object;)Lcom/auto/accept/ui/viewmodel/MainViewModel;

    move-result-object v13

    const/16 v2, 0x650

    :goto_0
    xor-int/lit16 v2, v2, 0x661

    sparse-switch v2, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v2, 0x68e

    goto :goto_0

    :sswitch_1
    if-eqz v3, :cond_0

    const/16 v2, 0x6ad

    goto :goto_0

    :sswitch_2
    const/16 v2, 0x6cc

    :goto_1
    xor-int/lit16 v2, v2, 0x6dd

    sparse-switch v2, :sswitch_data_1

    goto :goto_1

    :sswitch_3
    const/4 v2, 0x1

    if-eq v3, v2, :cond_1

    const/16 v2, 0x729

    goto :goto_1

    :cond_1
    :sswitch_4
    const/16 v2, 0x70a

    goto :goto_1

    :sswitch_5
    const/16 v2, 0x748

    :goto_2
    xor-int/lit16 v2, v2, 0x759

    sparse-switch v2, :sswitch_data_2

    goto :goto_2

    :sswitch_6
    const/4 v2, 0x2

    if-eq v3, v2, :cond_2

    const v2, 0xbe60

    goto :goto_2

    :cond_2
    :sswitch_7
    const v2, 0xbe41

    goto :goto_2

    :sswitch_8
    const v2, 0xbe7f

    :goto_3
    const v4, 0xbe90

    xor-int/2addr v2, v4

    sparse-switch v2, :sswitch_data_3

    goto :goto_3

    :cond_3
    :sswitch_9
    const v2, 0xbebd

    goto :goto_3

    :sswitch_a
    const/4 v2, 0x3

    if-ne v3, v2, :cond_3

    const v2, 0xbedc

    goto :goto_3

    :sswitch_b
    invoke-static/range {p0 .. p0}, Lcom/google/firebase/analytics/ktx/ktxtesting/۟ۤ۠ۤۤ;->۟ۥ۟ۢ۠(Ljava/lang/Object;)Lcom/google/firebase/auth/FirebaseUser;

    move-result-object v2

    invoke-static/range {p0 .. p0}, Lr6/۟ۡ۠۟ۡ;->ۥۡۦۧ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    invoke-static/range {p0 .. p0}, Ldagger/hilt/internal/componenttreedeps/۟ۡۢۥۥ;->ۨۧۥۧ(Ljava/lang/Object;)Lcom/auto/accept/ui/viewmodel/MainViewModel;

    move-result-object v4

    invoke-static/range {p0 .. p0}, Lcom/google/gson/internal/sql/ۣ۟ۧۨۧ;->۟۠ۢۤۥ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    :try_start_0
    invoke-static/range {p1 .. p1}, Lj9/۠۠ۨ;->ۣۨۧ۟(Ljava/lang/Object;)V

    const v3, 0xbefb

    :goto_4
    const v6, 0xbf0c

    xor-int/2addr v3, v6

    sparse-switch v3, :sswitch_data_4

    goto :goto_4

    :sswitch_c
    move-object v3, v2

    :goto_5
    invoke-static {v4}, Lcom/auto/accept/ui/viewmodel/ۡ۠ۨۥ;->ۨۧۥۨ(Ljava/lang/Object;)Lp9/q0;

    move-result-object v2

    invoke-static {}, Lw1/ۦۣۦۧ;->ۣ۟۟۠ۥ()Ljava/lang/Boolean;

    move-result-object v6

    invoke-static {v2, v6}, Ldagger/hilt/android/components/ۣ۟۟ۧۡ;->ۢۡۥۢ(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v4}, Ly/ۤۨۧ۟;->ۣ۟ۧۦۨ(Ljava/lang/Object;)V

    invoke-static {v4}, Le9/ۧۧۡ;->ۣ۟۠ۨۧ(Ljava/lang/Object;)La5/i0;

    move-result-object v2

    invoke-static {v2}, Li5/ۢۤۡ;->ۥ۠۟ۧ(Ljava/lang/Object;)Lp9/q0;

    move-result-object v2

    invoke-static {v2}, Ldagger/hilt/internal/aggregatedroot/ۢ۟ۤۧ;->۟ۡۡۨۤ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/auto/accept/data/model/AppConfig;

    invoke-static {v2}, Lw9/۟۠۠ۢ۟;->۠ۢۨۢ(Ljava/lang/Object;)Z

    move-result v6

    invoke-static {v4}, Lp8/ۡۤ;->۟ۧۧ۠(Ljava/lang/Object;)La5/j;

    move-result-object v2

    invoke-static {v2}, Landroidx/appcompat/widget/ۣۡۧۤ;->۟ۦۡۡۢ(Ljava/lang/Object;)Lcom/google/firebase/auth/FirebaseAuth;

    move-result-object v2

    invoke-static {v2}, Lf6/ۣۣۣۣ۟;->ۣ۟۟ۨۦ(Ljava/lang/Object;)Lcom/google/firebase/auth/FirebaseUser;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v7

    const v2, 0xcdff

    :goto_6
    const v8, 0xce10

    xor-int/2addr v2, v8

    sparse-switch v2, :sswitch_data_5

    goto :goto_6

    :cond_4
    :sswitch_d
    const v2, 0xce3d

    goto :goto_6

    :sswitch_e
    const v3, 0xbf1a

    goto :goto_4

    :catch_0
    move-exception v2

    move-object v3, v2

    const v2, 0xc202

    :goto_7
    const v4, 0xc213

    xor-int/2addr v2, v4

    sparse-switch v2, :sswitch_data_6

    goto :goto_7

    :sswitch_f
    const v2, 0xc221

    goto :goto_7

    :sswitch_10
    new-instance v2, Ljava/lang/IllegalStateException;

    invoke-static {}, Lf5/z;->ۣۣۡۡ()[S

    move-result-object v3

    const/16 v4, 0x18

    sget v5, Lr2/ۧۧۢۢ;->ۥۦۦ:I

    xor-int/lit16 v5, v5, 0x2f7

    const/16 v6, 0x639

    invoke-static {v3, v4, v5, v6}, Lm0/۟ۤۡۤۤ;->۟ۥ۟ۧۦ([SIII)Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v3}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v2

    :sswitch_11
    invoke-static/range {p0 .. p0}, Lcom/google/firebase/analytics/ktx/ktxtesting/۟ۤ۠ۤۤ;->۟ۥ۟ۢ۠(Ljava/lang/Object;)Lcom/google/firebase/auth/FirebaseUser;

    move-result-object v2

    invoke-static/range {p0 .. p0}, Lr6/۟ۡ۠۟ۡ;->ۥۡۦۧ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    invoke-static/range {p0 .. p0}, Ldagger/hilt/internal/componenttreedeps/۟ۡۢۥۥ;->ۨۧۥۧ(Ljava/lang/Object;)Lcom/auto/accept/ui/viewmodel/MainViewModel;

    move-result-object v4

    invoke-static/range {p0 .. p0}, Lcom/google/gson/internal/sql/ۣ۟ۧۨۧ;->۟۠ۢۤۥ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    :try_start_1
    invoke-static/range {p1 .. p1}, Lj9/۠۠ۨ;->ۣۨۧ۟(Ljava/lang/Object;)V

    check-cast p1, Lq8/h;

    invoke-static/range {p1 .. p1}, Landroid/support/v4/app/۟۟۠ۡۥ;->ۥ۟ۡۤ(Ljava/lang/Object;)Ljava/lang/Class;

    const v3, 0xc27e

    :goto_8
    const v6, 0xc28f

    xor-int/2addr v3, v6

    sparse-switch v3, :sswitch_data_7

    goto :goto_8

    :goto_9
    :sswitch_12
    move-object/from16 v0, p0

    iput-object v9, v0, Lf5/z;->a:Ljava/lang/Object;

    move-object/from16 v0, p0

    iput-object v4, v0, Lf5/z;->b:Lcom/auto/accept/ui/viewmodel/MainViewModel;

    move-object/from16 v0, p0

    iput-object v5, v0, Lf5/z;->c:Ljava/lang/String;

    move-object/from16 v0, p0

    iput-object v2, v0, Lf5/z;->d:Lcom/google/firebase/auth/FirebaseUser;

    const/4 v3, 0x3

    move-object/from16 v0, p0

    iput v3, v0, Lf5/z;->e:I

    const-wide/16 v6, 0x185

    sget v3, Lcom/auto/accept/service/۟۠ۧۧۢ;->ۡۨ۟ۨ:I

    int-to-long v0, v3

    move-wide/from16 v16, v0

    xor-long v6, v6, v16

    move-object/from16 v0, p0

    invoke-static {v6, v7, v0}, Lg0/۟ۥۢۥۢ;->ۣۣ۟۟ۧ(JLjava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    const v3, 0xcd83

    :goto_a
    const v7, 0xcd94

    xor-int/2addr v3, v7

    sparse-switch v3, :sswitch_data_8

    goto :goto_a

    :sswitch_13
    if-ne v6, v11, :cond_a

    const v3, 0xcde0

    goto :goto_a

    :sswitch_14
    const v3, 0xc29d

    goto :goto_8

    :sswitch_15
    invoke-static/range {p1 .. p1}, Lj9/۠۠ۨ;->ۣۨۧ۟(Ljava/lang/Object;)V

    check-cast p1, Lq8/h;

    invoke-static/range {p1 .. p1}, Ln/ۣۣۢۢ;->ۥ۟ۡۦ(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    move-result-object v9

    :sswitch_16
    const v2, 0xc2fa

    :goto_b
    const v3, 0xc30b

    xor-int/2addr v2, v3

    sparse-switch v2, :sswitch_data_9

    goto :goto_b

    :sswitch_17
    const v2, 0xc5a4

    goto :goto_b

    :sswitch_18
    invoke-static/range {p1 .. p1}, Lj9/۠۠ۨ;->ۣۨۧ۟(Ljava/lang/Object;)V

    invoke-static {v13}, Lcom/auto/accept/ui/viewmodel/ۡ۠ۨۥ;->ۨۧۥۨ(Ljava/lang/Object;)Lp9/q0;

    move-result-object v2

    invoke-static {}, Lk3/۟ۧ۠۠ۦ;->۟۟ۤۤۢ()Ljava/lang/Boolean;

    move-result-object v3

    invoke-static {v2, v3}, Ldagger/hilt/android/components/ۣ۟۟ۧۡ;->ۢۡۥۢ(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v13}, Lp8/۟۟ۢ۟ۢ;->۟ۢۥ۟ۥ(Ljava/lang/Object;)Lp9/q0;

    move-result-object v3

    const/4 v2, 0x0

    invoke-static {v3, v2}, Ldagger/hilt/android/components/ۣ۟۟ۧۡ;->ۢۡۥۢ(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v13}, Lcom/google/firebase/components/ۧ۠ۤۤ;->ۣ۟ۤۢ۟(Ljava/lang/Object;)Z

    move-result v4

    const v2, 0xc601

    :goto_c
    const v5, 0xc612

    xor-int/2addr v2, v5

    sparse-switch v2, :sswitch_data_a

    goto :goto_c

    :sswitch_19
    if-nez v4, :cond_5

    const v2, 0xc65e

    goto :goto_c

    :cond_5
    :sswitch_1a
    const v2, 0xc63f

    goto :goto_c

    :sswitch_1b
    invoke-static {}, Lf5/z;->ۣۣۡۡ()[S

    move-result-object v2

    const/16 v4, 0x47

    sget v5, Lcom/google/firebase/measurement_impl/۟ۧۢۢۢ;->ۧۢ۟ۦ:I

    xor-int/lit16 v5, v5, 0x322

    const/16 v6, 0x623

    invoke-static {v2, v4, v5, v6}, Lcom/google/firebase/firestore/core/ۧۤۡۧ;->۟ۡۤۤۧ([SIII)Ljava/lang/String;

    move-result-object v2

    invoke-static {v3, v2}, Ldagger/hilt/android/components/ۣ۟۟ۧۡ;->ۢۡۥۢ(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v2, Lf5/c;

    invoke-static {}, Lf5/z;->ۣۣۡۡ()[S

    move-result-object v3

    const/16 v4, 0x79

    sget v5, Lcom/google/firebase/abt/۟ۡۥۢۨ;->ۣۣ۟۠۟:I

    xor-int/lit16 v5, v5, 0x22e

    const/16 v6, 0x2b6

    invoke-static {v3, v4, v5, v6}, Lja/ۥۣۨ۠;->۟۠۠ۧۡ([SIII)Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v3}, Lf5/c;-><init>(Ljava/lang/String;)V

    invoke-static {v13}, Ld9/ۧۧۨۥ;->ۦۧۡۢ(Ljava/lang/Object;)Lp9/q0;

    move-result-object v3

    invoke-static {v3, v2}, Ldagger/hilt/android/components/ۣ۟۟ۧۡ;->ۢۡۥۢ(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {}, Lw1/ۦۣۦۧ;->ۣ۟۟۠ۥ()Ljava/lang/Boolean;

    move-result-object v2

    invoke-static {v13}, Lcom/auto/accept/ui/viewmodel/ۡ۠ۨۥ;->ۨۧۥۨ(Ljava/lang/Object;)Lp9/q0;

    move-result-object v3

    invoke-static {v3, v2}, Ldagger/hilt/android/components/ۣ۟۟ۧۡ;->ۢۡۥۢ(Ljava/lang/Object;Ljava/lang/Object;)V

    move-object v2, v12

    :goto_d
    return-object v2

    :sswitch_1c
    :try_start_2
    invoke-static {v13}, Lp8/ۡۤ;->۟ۧۧ۠(Ljava/lang/Object;)La5/j;

    move-result-object v2

    invoke-static/range {p0 .. p0}, Lb/۠ۨۦۥ;->ۡۦۡۨ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-static/range {p0 .. p0}, Lcom/google/android/gms/common/ۦۢۨ;->ۥۧ۟ۥ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x1

    move-object/from16 v0, p0

    iput v5, v0, Lf5/z;->e:I

    move-object/from16 v0, p0

    invoke-static {v2, v3, v4, v0}, Lcom/google/firebase/firestore/auth/۠ۦۣۢ;->ۣۣ۟ۢۤ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    const v2, 0xc67d

    :goto_e
    const v3, 0xc68e

    xor-int/2addr v2, v3

    sparse-switch v2, :sswitch_data_b

    goto :goto_e

    :cond_6
    :sswitch_1d
    const v2, 0xc6bb

    goto :goto_e

    :sswitch_1e
    if-ne v9, v11, :cond_6

    const v2, 0xc965

    goto :goto_e

    :sswitch_1f
    move-object v2, v11

    goto :goto_d

    :sswitch_20
    invoke-static/range {p0 .. p0}, Lc3/۟ۡۧۢۥ;->ۣۣۡۨ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-static/range {p0 .. p0}, Lb/۠ۨۦۥ;->ۡۦۡۨ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    instance-of v3, v9, Lq8/g;

    const v2, 0xc984

    :goto_f
    const v6, 0xc995

    xor-int/2addr v2, v6

    sparse-switch v2, :sswitch_data_c

    goto :goto_f

    :sswitch_21
    xor-int/lit8 v2, v3, -0x1

    and-int/lit8 v2, v2, 0x1

    and-int/lit8 v6, v3, -0x2

    or-int/2addr v2, v6

    if-eqz v2, :cond_7

    const v2, 0xc9e1

    goto :goto_f

    :cond_7
    :sswitch_22
    const v2, 0xc9c2

    goto :goto_f

    :sswitch_23
    move-object v0, v9

    check-cast v0, Lcom/google/firebase/auth/FirebaseUser;

    move-object v8, v0

    invoke-static {v13}, Lg2/ۢۥۥۡ;->ۤۨۤۢ(Ljava/lang/Object;)Landroid/app/Application;

    move-result-object v2

    invoke-static {v2}, Lcom/google/firebase/firestore/core/۟ۥۣ۠ۧ;->۟۠ۢۧۦ(Ljava/lang/Object;)Landroid/content/ContentResolver;

    move-result-object v2

    invoke-static {}, Lf5/z;->ۣۣۡۡ()[S

    move-result-object v3

    const/16 v6, 0x8f

    sget v7, Lcom/google/firebase/components/ۥۦ۠ۤ;->۟ۦۦۥ۟:I

    xor-int/lit16 v7, v7, -0x355

    const/16 v15, 0x72f

    invoke-static {v3, v6, v7, v15}, Lcom/google/firebase/auth/ktx/۟ۢۥۣۢ;->ۣ۟۟۠ۢ([SIII)Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Lp7/ۣۣۦۤ;->ۣۢۤ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    const v2, 0xca00

    :goto_10
    const v3, 0xca11

    xor-int/2addr v2, v3

    sparse-switch v2, :sswitch_data_d

    goto :goto_10

    :cond_8
    :sswitch_24
    const v2, 0xca3e

    goto :goto_10

    :sswitch_25
    if-nez v6, :cond_8

    const v2, 0xca5d

    goto :goto_10

    :sswitch_26
    invoke-static {}, Lv/ۣۢ۟ۧ;->ۤ۠ۦۦ()Ljava/lang/String;

    move-result-object v6

    :sswitch_27
    invoke-static {v13}, Lr5/۟ۤۨۥۡ;->ۤۢۧۤ(Ljava/lang/Object;)La5/z;

    move-result-object v2

    invoke-static {v8}, Lv8/۟ۧۢ۟ۢ;->ۧۨۨۥ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3, v14}, Lk3/ۦ۠ۢۥ;->۟ۥۢۨ۟(Ljava/lang/Object;Ljava/lang/Object;)V

    move-object/from16 v0, p0

    iput-object v9, v0, Lf5/z;->a:Ljava/lang/Object;

    move-object/from16 v0, p0

    iput-object v13, v0, Lf5/z;->b:Lcom/auto/accept/ui/viewmodel/MainViewModel;

    move-object/from16 v0, p0

    iput-object v5, v0, Lf5/z;->c:Ljava/lang/String;

    move-object/from16 v0, p0

    iput-object v8, v0, Lf5/z;->d:Lcom/google/firebase/auth/FirebaseUser;

    const/4 v7, 0x2

    move-object/from16 v0, p0

    iput v7, v0, Lf5/z;->e:I

    move-object/from16 v7, p0

    invoke-static/range {v2 .. v7}, Lb3/۟ۧ۠ۡۥ;->۟۠ۢۢۤ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    move-result-object v3

    const v2, 0xca7c

    :goto_11
    const v4, 0xca8d

    xor-int/2addr v2, v4

    sparse-switch v2, :sswitch_data_e

    goto :goto_11

    :sswitch_28
    if-ne v3, v11, :cond_9

    const v2, 0xcd64

    goto :goto_11

    :cond_9
    :sswitch_29
    const v2, 0xcd45

    goto :goto_11

    :sswitch_2a
    move-object v2, v11

    goto/16 :goto_d

    :sswitch_2b
    move-object v2, v8

    move-object v4, v13

    goto/16 :goto_9

    :cond_a
    :sswitch_2c
    const v3, 0xcdc1

    goto/16 :goto_a

    :sswitch_2d
    move-object v2, v11

    goto/16 :goto_d

    :sswitch_2e
    if-eqz v6, :cond_4

    const v2, 0xd0e7

    goto/16 :goto_6

    :sswitch_2f
    const v2, 0xd106

    :goto_12
    const v6, 0xd117

    xor-int/2addr v2, v6

    sparse-switch v2, :sswitch_data_f

    goto :goto_12

    :sswitch_30
    if-eqz v7, :cond_b

    const v2, 0xd163

    goto :goto_12

    :cond_b
    :sswitch_31
    const v2, 0xd144

    goto :goto_12

    :sswitch_32
    :try_start_3
    invoke-static {v7}, Ldagger/hilt/android/internal/modules/ۨۡ۠۠;->ۣۣ۠ۧ(Ljava/lang/Object;)Lcom/google/android/gms/tasks/Task;
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_1

    :sswitch_33
    :try_start_4
    invoke-static {v4}, Ld9/ۧۧۨۥ;->ۦۧۡۢ(Ljava/lang/Object;)Lp9/q0;

    move-result-object v2

    new-instance v3, Lf5/b;

    invoke-direct {v3, v5}, Lf5/b;-><init>(Ljava/lang/String;)V

    invoke-static {v2, v3}, Ldagger/hilt/android/components/ۣ۟۟ۧۡ;->ۢۡۥۢ(Ljava/lang/Object;Ljava/lang/Object;)V

    const v2, 0xd182

    :goto_13
    const v3, 0xd193

    xor-int/2addr v2, v3

    sparse-switch v2, :sswitch_data_10

    goto :goto_13

    :sswitch_34
    const v2, 0xd1a1

    goto :goto_13

    :sswitch_35
    invoke-static {v3}, Lv8/۟ۧۢ۟ۢ;->ۧۨۨۥ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, v14}, Lk3/ۦ۠ۢۥ;->۟ۥۢۨ۟(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v4, v2}, Lx2/۟ۢۥ;->ۥۣۨ۟(Ljava/lang/Object;Ljava/lang/Object;)V

    :sswitch_36
    invoke-static {v9}, Lz1/۟ۦ۟۠۟;->ۦ۟ۥۧ(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v4

    const v2, 0xd1fe

    :goto_14
    const v3, 0xd20f

    xor-int/2addr v2, v3

    sparse-switch v2, :sswitch_data_11

    goto :goto_14

    :sswitch_37
    if-eqz v4, :cond_c

    const v2, 0xd4e6

    goto :goto_14

    :cond_c
    :sswitch_38
    const v2, 0xd4c7

    goto :goto_14

    :sswitch_39
    invoke-static {v13}, Lp8/۟۟ۢ۟ۢ;->۟ۢۥ۟ۥ(Ljava/lang/Object;)Lp9/q0;

    move-result-object v5

    invoke-static {v4}, Ld1/۟ۡۨۧۢ;->۟۟ۨۢ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    const v3, 0xd505

    :goto_15
    const v6, 0xd516

    xor-int/2addr v3, v6

    sparse-switch v3, :sswitch_data_12

    goto :goto_15

    :sswitch_3a
    if-nez v2, :cond_d

    const v3, 0xd562

    goto :goto_15

    :cond_d
    :sswitch_3b
    const v3, 0xd543

    goto :goto_15

    :sswitch_3c
    move-object v2, v10

    :sswitch_3d
    invoke-static {v5, v2}, Ldagger/hilt/android/components/ۣ۟۟ۧۡ;->ۢۡۥۢ(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v13}, Ld9/ۧۧۨۥ;->ۦۧۡۢ(Ljava/lang/Object;)Lp9/q0;

    move-result-object v5

    new-instance v6, Lf5/c;

    invoke-static {v4}, Ld1/۟ۡۨۧۢ;->۟۟ۨۢ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    const v3, 0xd581

    :goto_16
    const v4, 0xd592

    xor-int/2addr v3, v4

    sparse-switch v3, :sswitch_data_13

    goto :goto_16

    :sswitch_3e
    if-nez v2, :cond_e

    const v3, 0xd869

    goto :goto_16

    :cond_e
    :sswitch_3f
    const v3, 0xd5bf

    goto :goto_16

    :sswitch_40
    move-object v2, v10

    :sswitch_41
    invoke-direct {v6, v2}, Lf5/c;-><init>(Ljava/lang/String;)V

    invoke-static {v5, v6}, Ldagger/hilt/android/components/ۣ۟۟ۧۡ;->ۢۡۥۢ(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v13}, Lcom/auto/accept/ui/viewmodel/ۡ۠ۨۥ;->ۨۧۥۨ(Ljava/lang/Object;)Lp9/q0;

    move-result-object v2

    invoke-static {}, Lw1/ۦۣۦۧ;->ۣ۟۟۠ۥ()Ljava/lang/Boolean;

    move-result-object v3

    invoke-static {v2, v3}, Ldagger/hilt/android/components/ۣ۟۟ۧۡ;->ۢۡۥۢ(Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0

    const v2, 0xd888

    :goto_17
    const v3, 0xd899

    xor-int/2addr v2, v3

    sparse-switch v2, :sswitch_data_14

    goto :goto_17

    :sswitch_42
    const v2, 0xd8a7

    goto :goto_17

    :sswitch_43
    invoke-static {v13}, Lp8/۟۟ۢ۟ۢ;->۟ۢۥ۟ۥ(Ljava/lang/Object;)Lp9/q0;

    move-result-object v5

    invoke-static {v3}, Ld1/۟ۡۨۧۢ;->۟۟ۨۢ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    const v4, 0xd904

    :goto_18
    const v6, 0xd915

    xor-int/2addr v4, v6

    sparse-switch v4, :sswitch_data_15

    goto :goto_18

    :sswitch_44
    if-nez v2, :cond_f

    const v4, 0xd961

    goto :goto_18

    :cond_f
    :sswitch_45
    const v4, 0xd942

    goto :goto_18

    :sswitch_46
    move-object v2, v10

    :sswitch_47
    invoke-static {v5, v2}, Ldagger/hilt/android/components/ۣ۟۟ۧۡ;->ۢۡۥۢ(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v3}, Ld1/۟ۡۨۧۢ;->۟۟ۨۢ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    const v3, 0xd980

    :goto_19
    const v4, 0xd991

    xor-int/2addr v3, v4

    sparse-switch v3, :sswitch_data_16

    goto :goto_19

    :sswitch_48
    if-nez v2, :cond_10

    const v3, 0xdc68

    goto :goto_19

    :cond_10
    :sswitch_49
    const v3, 0xdc49

    goto :goto_19

    :sswitch_4a
    const v2, 0xdc87

    :goto_1a
    const v3, 0xdc98

    xor-int/2addr v2, v3

    sparse-switch v2, :sswitch_data_17

    goto :goto_1a

    :sswitch_4b
    const v2, 0xdca6

    goto :goto_1a

    :sswitch_4c
    move-object v10, v2

    :sswitch_4d
    new-instance v2, Lf5/c;

    invoke-direct {v2, v10}, Lf5/c;-><init>(Ljava/lang/String;)V

    invoke-static {v13}, Ld9/ۧۧۨۥ;->ۦۧۡۢ(Ljava/lang/Object;)Lp9/q0;

    move-result-object v3

    invoke-static {v3, v2}, Ldagger/hilt/android/components/ۣ۟۟ۧۡ;->ۢۡۥۢ(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {}, Lw1/ۦۣۦۧ;->ۣ۟۟۠ۥ()Ljava/lang/Boolean;

    move-result-object v2

    invoke-static {v13}, Lcom/auto/accept/ui/viewmodel/ۡ۠ۨۥ;->ۨۧۥۨ(Ljava/lang/Object;)Lp9/q0;

    move-result-object v3

    invoke-static {v3, v2}, Ldagger/hilt/android/components/ۣ۟۟ۧۡ;->ۢۡۥۢ(Ljava/lang/Object;Ljava/lang/Object;)V

    :sswitch_4e
    move-object v2, v12

    goto/16 :goto_d

    :catch_1
    move-exception v2

    const v2, 0xdd03

    :goto_1b
    const v3, 0xdd14

    xor-int/2addr v2, v3

    sparse-switch v2, :sswitch_data_18

    goto :goto_1b

    :sswitch_4f
    const v2, 0xdd22

    goto :goto_1b

    :sswitch_50
    move-object v3, v2

    goto/16 :goto_5

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_18
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_3
        0x36 -> :sswitch_4
        0x1d7 -> :sswitch_15
        0x1f4 -> :sswitch_5
    .end sparse-switch

    :sswitch_data_2
    .sparse-switch
        0x11 -> :sswitch_6
        0xb918 -> :sswitch_11
        0xb939 -> :sswitch_8
        0xb97b -> :sswitch_7
    .end sparse-switch

    :sswitch_data_3
    .sparse-switch
        0xe -> :sswitch_9
        0x2d -> :sswitch_10
        0x4c -> :sswitch_b
        0xef -> :sswitch_a
    .end sparse-switch

    :sswitch_data_4
    .sparse-switch
        0x16 -> :sswitch_c
        0x1f7 -> :sswitch_e
    .end sparse-switch

    :sswitch_data_5
    .sparse-switch
        0xe -> :sswitch_d
        0x2d -> :sswitch_35
        0x3ef -> :sswitch_2e
        0x1ef7 -> :sswitch_2f
    .end sparse-switch

    :sswitch_data_6
    .sparse-switch
        0x11 -> :sswitch_f
        0x32 -> :sswitch_43
    .end sparse-switch

    :sswitch_data_7
    .sparse-switch
        0x12 -> :sswitch_12
        0xf1 -> :sswitch_14
    .end sparse-switch

    :sswitch_data_8
    .sparse-switch
        0x17 -> :sswitch_13
        0x36 -> :sswitch_2c
        0x55 -> :sswitch_50
        0x74 -> :sswitch_2d
    .end sparse-switch

    :sswitch_data_9
    .sparse-switch
        0x1f1 -> :sswitch_17
        0x6af -> :sswitch_20
    .end sparse-switch

    :sswitch_data_a
    .sparse-switch
        0x13 -> :sswitch_19
        0x2d -> :sswitch_1c
        0x32 -> :sswitch_1a
        0x4c -> :sswitch_1b
    .end sparse-switch

    :sswitch_data_b
    .sparse-switch
        0x12 -> :sswitch_1d
        0x35 -> :sswitch_16
        0xf3 -> :sswitch_1e
        0xfeb -> :sswitch_1f
    .end sparse-switch

    :sswitch_data_c
    .sparse-switch
        0x11 -> :sswitch_21
        0x36 -> :sswitch_22
        0x57 -> :sswitch_36
        0x74 -> :sswitch_23
    .end sparse-switch

    :sswitch_data_d
    .sparse-switch
        0xe -> :sswitch_24
        0x11 -> :sswitch_25
        0x2f -> :sswitch_27
        0x4c -> :sswitch_26
    .end sparse-switch

    :sswitch_data_e
    .sparse-switch
        0xf1 -> :sswitch_28
        0x7ab -> :sswitch_29
        0x7c8 -> :sswitch_2b
        0x7e9 -> :sswitch_2a
    .end sparse-switch

    :sswitch_data_f
    .sparse-switch
        0x11 -> :sswitch_30
        0x32 -> :sswitch_31
        0x53 -> :sswitch_35
        0x74 -> :sswitch_32
    .end sparse-switch

    :sswitch_data_10
    .sparse-switch
        0x11 -> :sswitch_34
        0x32 -> :sswitch_36
    .end sparse-switch

    :sswitch_data_11
    .sparse-switch
        0x3f1 -> :sswitch_37
        0x6a7 -> :sswitch_38
        0x6c8 -> :sswitch_4e
        0x6e9 -> :sswitch_39
    .end sparse-switch

    :sswitch_data_12
    .sparse-switch
        0x13 -> :sswitch_3a
        0x32 -> :sswitch_3b
        0x55 -> :sswitch_3d
        0x74 -> :sswitch_3c
    .end sparse-switch

    :sswitch_data_13
    .sparse-switch
        0x13 -> :sswitch_3e
        0x2d -> :sswitch_41
        0x32 -> :sswitch_3f
        0xdfb -> :sswitch_40
    .end sparse-switch

    :sswitch_data_14
    .sparse-switch
        0x11 -> :sswitch_42
        0x3e -> :sswitch_4e
    .end sparse-switch

    :sswitch_data_15
    .sparse-switch
        0x11 -> :sswitch_44
        0x36 -> :sswitch_45
        0x57 -> :sswitch_47
        0x74 -> :sswitch_46
    .end sparse-switch

    :sswitch_data_16
    .sparse-switch
        0x11 -> :sswitch_48
        0x5bb -> :sswitch_49
        0x5d8 -> :sswitch_4c
        0x5f9 -> :sswitch_4a
    .end sparse-switch

    :sswitch_data_17
    .sparse-switch
        0x1f -> :sswitch_4b
        0x3e -> :sswitch_4d
    .end sparse-switch

    :sswitch_data_18
    .sparse-switch
        0x17 -> :sswitch_4f
        0x36 -> :sswitch_33
    .end sparse-switch
.end method
