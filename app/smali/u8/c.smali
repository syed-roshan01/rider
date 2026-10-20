.class public final Lu8/c;
.super Ld9/j;

# interfaces
.implements Lc9/e;


# static fields
.field public static final b:Lu8/c;

.field public static final c:Lu8/c;


# instance fields
.field public final synthetic a:I


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 2

    new-instance v0, Lu8/c;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lu8/c;-><init>(I)V

    sput-object v0, Lu8/c;->b:Lu8/c;

    new-instance v0, Lu8/c;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lu8/c;-><init>(I)V

    sput-object v0, Lu8/c;->c:Lu8/c;

    return-void
.end method

.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, Lu8/c;->a:I

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Ld9/j;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget v0, p0, Lu8/c;->a:I

    const-string v1, "element"

    const-string v2, "acc"

    packed-switch v0, :pswitch_data_0

    check-cast p1, Lu8/j;

    check-cast p2, Lu8/h;

    invoke-static {p1, v2}, Ld7/a;->m(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p2, v1}, Ld7/a;->m(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p2}, Lu8/h;->getKey()Lu8/i;

    move-result-object v0

    invoke-interface {p1, v0}, Lu8/j;->u(Lu8/i;)Lu8/j;

    move-result-object p1

    sget-object v0, Lu8/k;->a:Lu8/k;

    if-ne p1, v0, :cond_0

    goto :goto_1

    :cond_0
    sget-object v1, Lu8/f;->a:Lu8/f;

    invoke-interface {p1, v1}, Lu8/j;->f(Lu8/i;)Lu8/h;

    move-result-object v2

    check-cast v2, Lu8/g;

    if-nez v2, :cond_1

    new-instance v0, Lu8/d;

    invoke-direct {v0, p2, p1}, Lu8/d;-><init>(Lu8/h;Lu8/j;)V

    :goto_0
    move-object p2, v0

    goto :goto_1

    :cond_1
    invoke-interface {p1, v1}, Lu8/j;->u(Lu8/i;)Lu8/j;

    move-result-object p1

    if-ne p1, v0, :cond_2

    new-instance p1, Lu8/d;

    invoke-direct {p1, v2, p2}, Lu8/d;-><init>(Lu8/h;Lu8/j;)V

    move-object p2, p1

    goto :goto_1

    :cond_2
    new-instance v0, Lu8/d;

    new-instance v1, Lu8/d;

    invoke-direct {v1, p2, p1}, Lu8/d;-><init>(Lu8/h;Lu8/j;)V

    invoke-direct {v0, v2, v1}, Lu8/d;-><init>(Lu8/h;Lu8/j;)V

    goto :goto_0

    :goto_1
    return-object p2

    :pswitch_0
    check-cast p1, Ljava/lang/String;

    check-cast p2, Lu8/h;

    invoke-static {p1, v2}, Ld7/a;->m(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p2, v1}, Ld7/a;->m(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    if-nez v0, :cond_3

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    goto :goto_2

    :cond_3
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, ", "

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    :goto_2
    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
