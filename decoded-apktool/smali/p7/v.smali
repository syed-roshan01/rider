.class public final enum Lp7/v;
.super Lp7/y;


# direct methods
.method public constructor <init>()V
    .locals 2

    const-string v0, "LAZILY_PARSED_NUMBER"

    const/4 v1, 0x1

    invoke-direct {p0, v0, v1}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method


# virtual methods
.method public final a(Lv7/a;)Ljava/lang/Number;
    .locals 1

    new-instance v0, Lr7/k;

    invoke-virtual {p1}, Lv7/a;->i0()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Lr7/k;-><init>(Ljava/lang/String;)V

    return-object v0
.end method
