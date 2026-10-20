.class public final Lu/x1;
.super Ljava/lang/Object;

# interfaces
.implements Lu/i1;


# static fields
.field public static final a:Lu/x1;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lu/x1;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lu/x1;->a:Lu/x1;

    return-void
.end method


# virtual methods
.method public final a(Lx/l;Lm0/m;)Lu/j1;
    .locals 1

    check-cast p2, Lm0/q;

    const p1, 0x1106bdb4

    invoke-virtual {p2, p1}, Lm0/q;->Z(I)V

    sget-object p1, Lu/w1;->a:Lu/w1;

    const/4 v0, 0x0

    invoke-virtual {p2, v0}, Lm0/q;->t(Z)V

    return-object p1
.end method
