.class public final Lg8/v2;
.super Ljava/lang/Object;

# interfaces
.implements Le8/y0;


# instance fields
.field public final synthetic a:Ljava/lang/Object;

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lg8/k3;Le8/y0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lg8/v2;->b:Ljava/lang/Object;

    iput-object p2, p0, Lg8/v2;->a:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lg8/v2;->b:Ljava/lang/Object;

    iput-object p2, p0, Lg8/v2;->a:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final a(Le8/y;)V
    .locals 7

    iget-object v0, p0, Lg8/v2;->b:Ljava/lang/Object;

    check-cast v0, Lg8/h4;

    iget-object v1, p0, Lg8/v2;->a:Ljava/lang/Object;

    check-cast v1, Le8/x0;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v2, p1, Le8/y;->a:Le8/x;

    sget-object v3, Le8/x;->e:Le8/x;

    if-ne v2, v3, :cond_0

    goto/16 :goto_1

    :cond_0
    sget-object v3, Le8/x;->c:Le8/x;

    sget-object v4, Le8/x;->d:Le8/x;

    iget-object v5, v0, Lg8/h4;->c:Le8/j0;

    if-eq v2, v3, :cond_1

    if-ne v2, v4, :cond_2

    :cond_1
    invoke-virtual {v5}, Le8/j0;->o()V

    :cond_2
    iget-object v6, v0, Lg8/h4;->e:Le8/x;

    if-ne v6, v3, :cond_4

    sget-object v3, Le8/x;->a:Le8/x;

    if-ne v2, v3, :cond_3

    goto :goto_1

    :cond_3
    if-ne v2, v4, :cond_4

    invoke-virtual {v0}, Lg8/h4;->e()V

    goto :goto_1

    :cond_4
    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    move-result v3

    if-eqz v3, :cond_8

    const/4 v4, 0x1

    if-eq v3, v4, :cond_7

    const/4 v4, 0x2

    if-eq v3, v4, :cond_6

    const/4 p1, 0x3

    if-ne v3, p1, :cond_5

    new-instance p1, Lg8/w2;

    invoke-direct {p1, v0, v1}, Lg8/w2;-><init>(Lg8/h4;Le8/x0;)V

    goto :goto_0

    :cond_5
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Unsupported state:"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_6
    new-instance v1, Lg8/g4;

    iget-object p1, p1, Le8/y;->b:Le8/c2;

    invoke-static {p1}, Le8/v0;->a(Le8/c2;)Le8/v0;

    move-result-object p1

    invoke-direct {v1, p1}, Lg8/g4;-><init>(Le8/v0;)V

    move-object p1, v1

    goto :goto_0

    :cond_7
    new-instance p1, Lg8/g4;

    const/4 v3, 0x0

    invoke-static {v1, v3}, Le8/v0;->b(Le8/x0;Ln8/m;)Le8/v0;

    move-result-object v1

    invoke-direct {p1, v1}, Lg8/g4;-><init>(Le8/v0;)V

    goto :goto_0

    :cond_8
    new-instance p1, Lg8/g4;

    sget-object v1, Le8/v0;->e:Le8/v0;

    invoke-direct {p1, v1}, Lg8/g4;-><init>(Le8/v0;)V

    :goto_0
    iput-object v2, v0, Lg8/h4;->e:Le8/x;

    invoke-virtual {v5, v2, p1}, Le8/j0;->r(Le8/x;Lz6/a;)V

    :goto_1
    return-void
.end method
