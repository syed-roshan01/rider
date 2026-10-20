.class public final Lq9/x;
.super Ljava/lang/Object;

# interfaces
.implements Lp9/g;


# instance fields
.field public final a:Lo9/t;


# direct methods
.method public constructor <init>(Lo9/t;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lq9/x;->a:Lo9/t;

    return-void
.end method


# virtual methods
.method public final emit(Ljava/lang/Object;Lu8/e;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lq9/x;->a:Lo9/t;

    invoke-interface {v0, p1, p2}, Lo9/t;->h(Ljava/lang/Object;Lu8/e;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lv8/a;->a:Lv8/a;

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Lq8/l;->a:Lq8/l;

    return-object p1
.end method
