.class public final synthetic Lq9/v;
.super Ld9/h;

# interfaces
.implements Lc9/f;


# static fields
.field public static final p:Lq9/v;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    new-instance v6, Lq9/v;

    const/4 v1, 0x3

    const-class v2, Lp9/g;

    const-string v3, "emit"

    const-string v4, "emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"

    const/4 v5, 0x0

    move-object v0, v6

    invoke-direct/range {v0 .. v5}, Ld9/h;-><init>(ILjava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    sput-object v6, Lq9/v;->p:Lq9/v;

    return-void
.end method


# virtual methods
.method public final e(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lp9/g;

    check-cast p3, Lu8/e;

    invoke-interface {p1, p2, p3}, Lp9/g;->emit(Ljava/lang/Object;Lu8/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
