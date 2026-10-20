.class public final Ld5/l1;
.super Ld9/j;

# interfaces
.implements Lc9/a;


# instance fields
.field public final a:I

.field public final b:Lg5/a;

.field public final c:Lm0/g1;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public synthetic constructor <init>(Lg5/a;Lm0/g1;I)V
    .locals 3

    iput p3, p0, Ld5/l1;->a:I

    iput-object p1, p0, Ld5/l1;->b:Lg5/a;

    iput-object p2, p0, Ld5/l1;->c:Lm0/g1;

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Ld9/j;-><init>(I)V

    invoke-static {}, Lcom/google/firebase/measurement/ۧۤۦۧ;->ۧۨۡ۟()I

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
    const-string v0, "3Is5L"

    invoke-static {v0}, Lcom/google/firebase/installations/interop/۠ۨۧ۠;->ۡۡۢۤ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v0

    sget-object v2, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v2, v0, v1}, Ljava/io/PrintStream;->println(D)V

    :sswitch_3
    return-void

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_3
    .end sparse-switch
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 4

    invoke-static {}, Laa/۟ۦۣۢۨ;->ۣۧ۟ۡ()Lq8/l;

    move-result-object v0

    invoke-static {p0}, Lf6/ۣۣۣۣ۟;->۟ۤۦۡ۟(Ljava/lang/Object;)Lg5/a;

    move-result-object v1

    invoke-static {p0}, Lcom/google/android/gms/auth/api/signin/ۦ۟;->ۥۣۤۡ(Ljava/lang/Object;)Lm0/g1;

    move-result-object v2

    invoke-static {p0}, Lh8/۟ۨۧ;->۟ۤ۠۠ۡ(Ljava/lang/Object;)I

    move-result v3

    packed-switch v3, :pswitch_data_0

    packed-switch v3, :pswitch_data_1

    invoke-static {v1}, Lr6/ۥۡۥۥ;->۟ۤۢۦ۟(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v2, v1}, Ld9/ۥۡۧۡ;->۟ۥۥۦۥ(Ljava/lang/Object;Ljava/lang/Object;)V

    const/16 v1, 0x650

    :goto_0
    xor-int/lit16 v1, v1, 0x661

    sparse-switch v1, :sswitch_data_0

    goto :goto_0

    :goto_1
    :sswitch_0
    return-object v0

    :sswitch_1
    const/16 v1, 0x66f

    goto :goto_0

    :pswitch_0
    invoke-static {v1}, Lr6/ۥۡۥۥ;->۟ۤۢۦ۟(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v2, v1}, Ld9/ۥۡۧۡ;->۟ۥۥۦۥ(Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_1

    :pswitch_1
    packed-switch v3, :pswitch_data_2

    invoke-static {v1}, Lr6/ۥۡۥۥ;->۟ۤۢۦ۟(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v2, v1}, Ld9/ۥۡۧۡ;->۟ۥۥۦۥ(Ljava/lang/Object;Ljava/lang/Object;)V

    const/16 v1, 0x6cc

    :goto_2
    xor-int/lit16 v1, v1, 0x6dd

    sparse-switch v1, :sswitch_data_1

    goto :goto_2

    :sswitch_2
    const/16 v1, 0x6eb

    goto :goto_2

    :pswitch_2
    invoke-static {v1}, Lr6/ۥۡۥۥ;->۟ۤۢۦ۟(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v2, v1}, Ld9/ۥۡۧۡ;->۟ۥۥۦۥ(Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
    .end sparse-switch

    :pswitch_data_2
    .packed-switch 0x0
        :pswitch_2
    .end packed-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_2
        0x36 -> :sswitch_0
    .end sparse-switch
.end method
