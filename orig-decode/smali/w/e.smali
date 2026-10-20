.class public final Lw/e;
.super Ld9/j;

# interfaces
.implements Lc9/c;


# static fields
.field public static final a:Lw/e;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lw/e;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Ld9/j;-><init>(I)V

    sput-object v0, Lw/e;->a:Lw/e;

    return-void
.end method


# virtual methods
.method public final bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->floatValue()F

    sget-object p1, Lq8/l;->a:Lq8/l;

    return-object p1
.end method
